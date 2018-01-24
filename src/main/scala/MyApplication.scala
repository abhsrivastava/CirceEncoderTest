import io.circe._, io.circe.syntax._, io.circe.parser._

import com.abhi.models.Foo
import com.abhi.models.Bar

object MyApplication extends App {
   val x : Foo = Bar("Foo")
   println(x.asJson.toString)
}
