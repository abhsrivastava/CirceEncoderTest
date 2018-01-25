import io.circe._, io.circe.syntax._, io.circe.parser._, io.circe.generic.auto._

object MyApplication extends App {
   val x : Foo = Bar("Foo")
   println(x.asJson.toString)
}
