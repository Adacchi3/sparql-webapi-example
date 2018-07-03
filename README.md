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
or
```
$cd sparql-webapi-example 
$sbt run
```
link to [http://localhost:9000](http://localhost:9000)

## The Play application layout 
The layout of a Play application is standardized to keep things as simple as possible. After a first successful compile, a Play application looks like this:
```
README.md                       -> This document
app                             -> Application sources
├── controllers                 -> Application controllers
├── utils                       -> Application utilities
└── views                       -> Templates
build.sbt                       -> Application bulid script
conf                            -> Configurations files and other non-compiled resources (on classpath)
├── application.conf            -> Main configuration file
└── routes                      -> Routes definition
libexec                         -> Unmanaged libraries dependencies
logs                            -> Logs folder
project                         -> sbt configuratoin files
├── build.properties            -> Market for sbt project
├── plugins.sbt                 -> sbt plugins including the declaration for Play itself
public                          -> Public assets
├── images                      -> Image files
├── javascripts                 -> Javascript files
└── stylesheets                 -> CSS files
target                          ->  Generated stuff
test                            -> source folder for unit or functioonal tests
```
detail information is [here](https://www.playframework.com/documentation/2.5.x/Anatomy).
## SPARQL Querying 
```
GET /api/sparql controllers.SPARQLController.query(String query, String endpoint)
```
link to [this request](http://localhost:9000/api/sparql?query=select+distinct+*+where+%7B+%3Chttp%3A%2F%2Fja.dbpedia.org%2Fresource%2F%E6%9D%B1%E4%BA%AC%E9%83%BD%3E+%3Fp+%3Fo+.++%7D+LIMIT+10&endpoint=http://ja.dbpedia.org/sparql) example.

## How to implement?
Basically, we are implementing some feature in `app` directory. The `app` directory contains all executable artifacts: Java and Scala source code, templates and compiled assets' sources. 

There are some packages in the `app` directory, one for each component of the MVC architectural pattern. 

You can of course add your own packages, for example an `app/models` packages.