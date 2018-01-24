package com.abhi.models

import io.circe.generic.JsonCodec

@JsonCodec trait Foo
final case class Bar(name: String) extends Foo
object Foo