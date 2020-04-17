import cats.effect._

object CanonicalApp extends IOApp {
  def run(args: List[String]): IO[ExitCode] =
    IO {
      println("Hello, world!")
    }.as(ExitCode.Success)
}
