name := "CirceEncoderTest"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
   "io.circe" %% "circe-core" % "0.9.1",
   "io.circe" %% "circe-generic" % "0.9.1",
   "io.circe" %% "circe-parser" % "0.9.1"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)