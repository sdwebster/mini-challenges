// Based loosely on Jason Swartz "Learning Scala" Ch 6 ex 7
import scala.util.parsing.json._


object WeatherForecast extends App {
  // val url = "http://api.openweathermap.org/data/2.5/forecast?mode=json&lat==55&lon=0"
  // val l: List[String] = io.Source.fromURL(url).getLines.toList
  // val json:Option[Any] = JSON.parseFull(l(0))
  // val map:Map[String,Any] = json.get.asInstanceOf[Map[String, Any]]
  // val city = map.get("city")
  // printf(city.get.asInstanceOf[String])
  // for ((k,v) <- result) printf("key: %s, value: %s\n", k, v)
  val url = "http://api.openweathermap.org/data/2.5/forecast?mode=xml&lat==55&lon=0"
  val l: List[String] = io.Source.+fromURL(url).getLines.toList
  val xml = l(0)
  println(xml)

  // def prettyPrintXML(s: String, indent: Int) = {
    
  // }
}
