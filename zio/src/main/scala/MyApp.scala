import zio.*
import zio.Console.*

object MyApp extends ZIOAppDefault:
  def run: ZIO[Any, Any, Any] =
    myAppLogic.either.map(_.fold(_ => ExitCode.success, _ => ExitCode.failure))

  val myAppLogic =
    for
      _ <- printLine("Hello! What is your name?")
      n <- readLine
      _ <- printLine(s"Hello, $n, good to meet you!")
    yield ()
