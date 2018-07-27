import cats.implicits._
import cats.effect._

object Main extends App {
  def toBomb(n: Int) =
    IO {
      if (n == 3)
        throw new Exception(s"bomb $n")
      else
        println(s"print $n")
    }

  // stops IO'ing after 3
  List(1, 2, 3, 4, 5, 6)
    .traverse(toBomb)
    .unsafeRunSync
}

