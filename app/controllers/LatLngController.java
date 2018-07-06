package controllers;

import play.mvc.*;
import utils.QueryExecutor;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

class Judge {
  public float lat;
  public float lng;
  public Boolean good;
  public String reason;
}

public class LatLngController extends Controller {
  public Result distinguish(float lat, float lng){
    Judge judge = new Judge();
    judge.lat = lat;
    judge.lng = lng;
    judge.good = true; //true: good location(?) / false: bad location(?)
    judge.reason = "!!Good!!"; //why location is good/bad? 
    JsonNode judgeJson = Json.toJson(judge);
    return ok(judgeJson).withHeader("Access-Control-Allow-Origin", "*");
  }
}