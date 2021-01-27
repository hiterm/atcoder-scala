package abc189.a

import java.util.Scanner

object Main {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val s = sc.next()
    val a = s.charAt(0)
    val b = s.charAt(1)
    val c = s.charAt(2)

    val ans = if (a == b && b == c) "Won" else "Lost"
    println(ans)
  }
}
