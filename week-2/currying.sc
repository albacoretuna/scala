object currying {
  def sum(x: Int, y: Int) = x + y

  sum (2,3)

  def sumC(x: Int) = (y: Int) => x + y

  sumC(2)(3)

  def sumD(x:Int)(y: Int) = x + y

  sumD(2)(3)


}