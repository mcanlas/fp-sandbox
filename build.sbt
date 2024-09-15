lazy val root = Project("fp-sandbox", file("."))
  .aggregate(cats, catsEffect, fs2, zio, refined, circe, chimney)

lazy val cats = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-core" % "2.12.0")
  .settings(console / initialCommands := "import cats._, cats.data._, cats.syntax.all._")

lazy val catsEffect = project
  .settings(libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.4")
  .settings(console / initialCommands := "import cats._, cats.data._, cats.syntax.all._, cats.effect._")

lazy val fs2 = project
  .settings(libraryDependencies += "co.fs2" %% "fs2-core" % "3.11.0")
  .settings(console / initialCommands := "import cats._, cats.data._, cats.syntax.all._")

lazy val zio = project
  .settings(libraryDependencies += "dev.zio" %% "zio" % "2.1.9")

lazy val refined = project
  .settings(libraryDependencies += "eu.timepit" %% "refined" % "0.11.2")

lazy val circe = project
  .settings(
    libraryDependencies ++= List(
      "io.circe" %% "circe-core"    % "0.14.10",
      "io.circe" %% "circe-generic" % "0.14.10",
      "io.circe" %% "circe-parser"  % "0.14.10"
    )
  )

lazy val chimney = project
  .settings(libraryDependencies += "io.scalaland" %% "chimney" % "0.7.4")
