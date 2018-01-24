package com.abhi.models

import io.circe.generic.JsonCodec
import io.circe._, io.circe.syntax._, io.circe.parser._, io.circe.generic.auto._

@JsonCodec trait Foo
final case class Bar(name: String) extends Foo