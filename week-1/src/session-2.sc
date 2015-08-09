import scala.annotation.tailrec

object session2 {
  def hello() =
    println("hello world")

 hello

  def gcd(a: Int, b: Int) :Int =
    if(b == 0 ) a else (gcd(b, a % b))

  gcd(100000, 500)

 def factorial(n: Int) :Int = {
   if (n == 0) 1
   else
     n * factorial(n - 1)
 }
  factorial(19)

  def tailrecFactorial(x: Int) :Int = {
    def loop(acc: Int, x:Int): Int =
     if(x==0) acc
    else loop(acc * x, x-1)
     loop(1, x)
  }

  tailrecFactorial(31)

}