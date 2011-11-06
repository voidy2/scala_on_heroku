import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name := "k-dayone"

version := "1.0"

scalaVersion := "2.9.1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.1",
  "org.scalatra" %% "scalatra-scalate" % "2.0.1",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024" % "container",
  "org.eclipse.jetty" % "jetty-server" % "8.0.4.v20111024" % "container",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.4.v20111024",
  "org.eclipse.jetty" % "jetty-server" % "8.0.4.v20111024",
  "org.slf4j" % "slf4j-simple" % "1.6.1",
  "javax.servlet" % "javax.servlet-api" % "3.0.1" % "provided"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

ivyLoggingLevel := UpdateLogging.Full

fork := true

javaOptions += "-Xmx2G"

logLevel := Level.Info

offline := true

crossPaths := false

checksums in update := Nil

compileOrder := CompileOrder.JavaThenScala

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xmigration")

transitiveClassifiers := Seq("sources", "javadoc")

parallelExecution in Test := false

traceLevel := 10

