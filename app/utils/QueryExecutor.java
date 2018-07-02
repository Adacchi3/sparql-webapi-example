package utils;

import java.io.*;

import org.apache.jena.query.*;
import play.api.libs.json.*;

public class QueryExecutor {
  public String query(String queryString, String endpointString){
    Query query = QueryFactory.create(queryString);
    QueryExecution qe = QueryExecutionFactory.sparqlService(endpointString, query);
    if(query.getQueryType()==111){
      ResultSet results = qe.execSelect();
      OutputStream os = new ByteArrayOutputStream();
      ResultSetFormatter.outputAsJSON(os, results);
      return os.toString();
    }else if(query.getQueryType()==444){
      Boolean results = qe.execAsk();
      OutputStream outputStream = new ByteArrayOutputStream();
      ResultSetFormatter.outputAsJSON(outputStream, results);
      return  outputStream.toString();
    }
    return null;
  }
}