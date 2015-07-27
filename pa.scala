// imperative way
var i = 0
while(i<args.length){
println("Hello world "+ args(i))
i +=1
}

// functional way
args.foreach(arg=> println(arg))

// you don't have to even send the arg
args.foreach(println)

// scala fors
for(arg <- args)
  println(arg)
