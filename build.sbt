
name := "SparkML"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.0.1" ,
  "org.apache.spark" % "spark-sql_2.11" % "2.0.1" ,
  "org.apache.spark" % "spark-streaming_2.11" % "2.0.1"  ,
  "org.apache.spark" %% "spark-streaming" % "2.0.1" ,
  "org.apache.nifi" % "nifi-spark-receiver" % "1.1.2",
  "org.apache.spark" %% "spark-mllib" % "2.0.1",
  "org.json4s" %% "json4s-native" % "3.2.10"

  //  "ml.dmlc" %% "xgboost4j-spark" % "0.7"
)
// https://mvnrepository.com/artifact/ai.h2o/sparkling-water-core_2.11
libraryDependencies += "ai.h2o" % "sparkling-water-core_2.11" % "2.1.2"
// https://mvnrepository.com/artifact/ai.h2o/h2o-scala_2.11
//libraryDependencies += "ai.h2o" % "h2o-scala_2.11" % "3.10.4.2"

//ьфunmanagedJars in Compile += file(Path.userHome+"/Your-Jar-Path/Full-Jar-Name.jar")

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
resolvers += "Hortonworks Repository" at "http://repo.hortonworks.com/content/repositories/releases/"
resolvers += "Hortonworks Jetty Maven Repository" at "http://repo.hortonworks.com/content/repositories/jetty-hadoop/"
resolvers += Resolver.mavenLocal
resolvers += "central maven" at "https://repo1.maven.org/maven2/"



    