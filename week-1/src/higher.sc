object higher {
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int) = sum(id, a, b)

  def sumCubes(a: Int, b: Int) = sum(cube, a, b)

  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

  def id(x: Int): Int = x

  def cube(x: Int): Int = x * x * x

  def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

  sumInts(4, 6)

  // instead of small functions, we can create anonymous funcs
  def niceSumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)

  niceSumCubes(3,4)
}