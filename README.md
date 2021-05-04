# Simple Example Dremio Internal Functions

[![Build Status](https://travis-ci.org/dremio-hub/dremio-internal-function-example.svg?branch=master)](https://travis-ci.org/dremio-hub/dremio-internal-function-example)

This shows an example a customer function using Dremio's internal APIs.

## Example Usage:
* Purpose:
   * Demonstrate how to return a Runid for a specific date
   
* Usage example
```
SELECT example_concat_op(name, kind) FROM sys.options 
```

## To Build and deploy
mvn clean package 
cp {target dir}/udf-example*jar /Java/dremio/jars/3rdparty 
restart dremio
