import zio.App
import zio.console._

object MyApp extends App {
  def run(args: List[String]) =
    myAppLogic.either.map(_.fold(_ => 1, _ => 0))

  val myAppLogic =
    for {
      _ <- putStrLn("Hello! What is your name?")
      n <- getStrLn
      _ <- putStrLn(s"Hello, ${n}, good to meet you!")
    } yield ()
}

object UncontrolledMain {
  def main(args: Array[String]): Unit = {
    val runtime = new zio.DefaultRuntime {}
    val io = putStrLn("Hello World!")

    runtime.unsafeRun(io)
  }
}
