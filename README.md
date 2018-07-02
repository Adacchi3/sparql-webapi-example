# SPARQL WEB API EXAMPLE
A simple server/WEB API for SPARQL

## Requirements 
* Java 1.8.0
* Play Framework  2.5.10 

Check it out [here](https://www.playframework.com/documentation/2.5.x/Installing).

## Instrallation 
```
$git clone https://github.com/Adacchi3/sparql-webapi-example.git
```

## Quick Start
```
$cd sparql-webapi-example 
$activator run  
```
link to [http://localhost:9000](http://localhost:9000)

## SPARQL Querying 
```
GET /api/sparql controllers.SPARQLController.query(String query, String endpoint)
```
link to [this request](http://localhost:9000/api/sparql?query=select+distinct+*+where+%7B+%3Chttp%3A%2F%2Fja.dbpedia.org%2Fresource%2F%E6%9D%B1%E4%BA%AC%E9%83%BD%3E+%3Fp+%3Fo+.++%7D+LIMIT+10&endpoint=http://ja.dbpedia.org/sparql) example.