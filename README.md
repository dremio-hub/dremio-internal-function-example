# Simple Example Dremio Internal Functions

[![Build Status](https://travis-ci.org/dremio-hub/dremio-internal-function-example.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-internal-function-example)

This shows an example a customer function using Dremio's internal APIs.

## Example Usage:
* Purpose: Demonstrate how to execute example UDF example_concat_op(string1, string2)
```
SELECT example_concat_op(name, kind) FROM sys.options 
```

## To Build (on Dremio Coordinatpr Node)
1. yum install maven 
2. Change pom.xml : Replace Dremio Version 
3. mvn clean package 
4. Will Create 2 Jar Files  (udf-example-<dremio-ver>.jar and udf-example-<dremio-ver>-sources.jar)

## To Deploy
1. cp {target dir}/udf-example*jar   /opt/dremio/jars/3rdparty/.  (On Coordinator and Executor Nodes)
2. systemctl start dremio (On Coordinator and Executor Nodes)
