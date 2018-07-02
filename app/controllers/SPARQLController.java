package controllers;

import play.mvc.*;
import utils.QueryExecutor;

public class SPARQLController extends Controller {
  public Result query(String queryString, String endpointString){
    QueryExecutor qe = new QueryExecutor();
    String json = qe.query(queryString, endpointString);
    return ok(json).withHeader("Access-Control-Allow-Origin", "*");
  }
}