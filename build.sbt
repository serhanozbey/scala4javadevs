name := "scala4javadevs"

organization := "com.serhan.learning"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % "3.0.5",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)


resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"
//resolvers += "velvia maven" at "http://dl.bintray.com/velvia/maven"
//resolvers += Resolver.sonatypeRepo("releases")