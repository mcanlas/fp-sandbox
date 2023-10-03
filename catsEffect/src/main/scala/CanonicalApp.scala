import cats.effect.*

object CanonicalApp extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    IO {
      println("Hello, world!")
    }.as(ExitCode.Success)
}
