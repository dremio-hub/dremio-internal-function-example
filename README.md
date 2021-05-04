# Simple Example Dremio Internal Functions

[![Build Status](https://travis-ci.org/dremio-hub/dremio-internal-function-example.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-internal-function-example)

This shows an example a customer function using Dremio's internal APIs.

## Example Usage:
* Purpose: Demonstrate how to execute example UDF example_concat_op(string1, string2)
```
SELECT example_concat_op(name, kind) FROM sys.options 
```

## To Build and deploy
1. mvn clean package 
2. cp {target dir}/udf-example*jar   /opt/dremio/jars/3rdparty/. 
3. restart dremio
