import java.util.logging.Level

import sbt.addSbtPlugin

//logLevel := Level.Warn
resolvers += "JBoss" at "https://repository.jboss.org"
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.0-M8")