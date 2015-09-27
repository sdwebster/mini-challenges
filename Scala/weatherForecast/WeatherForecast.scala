// Based loosely on Jason Swartz "Learning Scala" Ch 6 ex 7
import scala.util.parsing.json._


object WeatherForecast extends App {
  val url = "http://api.openweathermap.org/data/2.5/forecast?mode=json&lat==55&lon=0"
  val l: List[String] = io.Source.fromURL(url).getLines.toList
  val result = JSON.parseFull(l(0))
  
}
