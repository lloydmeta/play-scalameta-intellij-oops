
import diesel.diesel
@diesel
trait Maths[F[_]] {
  def int(i: Int): F[Int]
  def add(a: F[Int], b: F[Int]): F[Int]
}