val greetStrings = new Array[String](3)

greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

for(i <- 0 to 2)
  print(greetStrings(i))

// 0 to 2 is interesting! it returns (0 , 1 , 2 )

// short hand function
args.foreach(arg => println(arg))
