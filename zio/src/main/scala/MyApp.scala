import zio.*
import zio.console.*

object MyApp extends App:
  def run(args: List[String]) =
    myAppLogic.either.map(_.fold(_ => ExitCode.success, _ => ExitCode.failure))

  val myAppLogic =
    for
      _ <- putStrLn("Hello! What is your name?")
      n <- getStrLn
      _ <- putStrLn(s"Hello, ${n}, good to meet you!")
    yield ()
