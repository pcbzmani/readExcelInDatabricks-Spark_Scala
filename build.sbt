name := "SparkScalaCourse"

version := "0.1"

scalaVersion := "2.12.12"
//add com.crealytics in dependencies version i'm using here is 0.13.0
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.0.0",
  "org.apache.spark" %% "spark-sql" % "3.0.0",
  "org.apache.spark" %% "spark-mllib" % "3.0.0",
  "org.apache.spark" %% "spark-streaming" % "3.0.0",
  "org.twitter4j" % "twitter4j-core" % "4.0.4",
  "org.twitter4j" % "twitter4j-stream" % "4.0.4",
  "com.crealytics" %% "spark-excel" % "0.13.0"
)
