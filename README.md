# Simple Example Dremio UDFs

[![Build Status](https://travis-ci.org/dremio-hub/dremio-udf-example.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-udf-example)

This shows an example UDF function for Dremio. The example has the signature example_concat_op(<varchar>, <varchar) and returns a new varchar. It can be used by copying the built jar file into the Dremio jars directory.

Example Usage:
```
SELECT example_concat_op(name, kind) FROM sys.options 
```
