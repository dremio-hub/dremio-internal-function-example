/*
 * Copyright (C) 2017-2018 Dremio Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.dremio.udf;

import javax.inject.Inject;

import org.apache.arrow.vector.holders.VarCharHolder;

import com.dremio.exec.expr.SimpleFunction;
import com.dremio.exec.expr.annotations.FunctionTemplate;
import com.dremio.exec.expr.annotations.FunctionTemplate.NullHandling;
import com.dremio.exec.expr.annotations.Output;
import com.dremio.exec.expr.annotations.Param;

import  org.apache.arrow.memory.ArrowBuf;

@FunctionTemplate(
    name = "example_concat_op",
    nulls = NullHandling.NULL_IF_NULL)
public class ConcatOp implements SimpleFunction {

  @Inject ArrowBuf buffer;

  @Param VarCharHolder left;
  @Param VarCharHolder right;
  @Output VarCharHolder out;

  @Override
  public void setup() {
  }

  @Override
  public void eval() {
    final int bytesLeftArg = left.end - left.start;
    final int bytesRightArg = right.end - right.start;
    final int finalLength = bytesLeftArg + bytesRightArg;

    out.buffer = buffer = buffer.reallocIfNeeded(finalLength);
    out.start = 0;
    out.end = finalLength;

    left.buffer.getBytes(left.start, out.buffer, 0, bytesLeftArg);
    right.buffer.getBytes(right.start, out.buffer, bytesLeftArg, bytesRightArg);
  }
}
