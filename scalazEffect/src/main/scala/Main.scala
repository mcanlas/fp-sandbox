import scalaz._, Scalaz._
import scalaz.ioeffect._

object Main extends SafeApp {
  def toBomb(n: Int): Task[Unit] =
    Task {
      if (n == 3)
        throw new Exception(s"scalaz bomb $n")
      else
        println(s"scalaz print $n")
    }

  override def run(args: List[String]): IO[Void, ExitStatus] =
    // stops IO'ing after 3
    List(1, 2, 3, 4, 5, 6)
      .traverse[Task, Unit](toBomb)
      .attempt
      .map(_.fold(_ => 1, _ => 0))
      .map { n => if (n == 0) println("safe") else println("err"); ExitStatus.ExitNow(n) }
}

