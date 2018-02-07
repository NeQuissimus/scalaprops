addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.3.1")
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.3.6")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "2.1")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.1")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.7")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.22")
addSbtPlugin("com.github.scalaprops" % "sbt-scalaprops" % "0.2.5")

scalacOptions ++= (
  "-deprecation" ::
  "-unchecked" ::
  "-language:existentials" ::
  "-language:higherKinds" ::
  "-language:implicitConversions" ::
  "-Yno-adapted-args" ::
  Nil
)

fullResolvers ~= {_.filterNot(_.name == "jcenter")}
