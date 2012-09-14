name := "OpenStudy"

version := "2.0"

organization := "com.openstudy"

scalaVersion := "2.9.2"

{
  val liftVersion = "2.5-SNAPSHOT"
  libraryDependencies ++= Seq(
    "net.liftweb" %% "lift-util" % liftVersion
  )
}

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.0.6"
)

scalacOptions ++= Seq("-encoding", "UTF-8", "-deprecation", "-unchecked")

javacOptions  ++= Seq("-Xlint:unchecked", "-Xlint:deprecation")
