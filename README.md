# Simple Example Dremio Internal Functions

[![Build Status](https://travis-ci.org/dremio-hub/dremio-internal-function-example.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-internal-function-example)

This shows an example a customer function using Dremio's internal APIs. The example has the signature example_concat_op(\<varchar\>, \<varchar\>) and returns a new varchar. It can be used by copying the built jar file into the Dremio jars directory.

Example Usage:
```
SELECT example_concat_op(name, kind) FROM sys.options 
```
