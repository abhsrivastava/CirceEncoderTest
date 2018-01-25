import io.circe.syntax._, io.circe._, io.circe.generic.auto._

object MyApplication extends App {
   val x : Foo = Bar("Foo")
   println(x.asJson.toString)
}
