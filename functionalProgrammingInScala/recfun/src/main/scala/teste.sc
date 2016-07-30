object teste {

	def sum(f: Int => Int)(a: Int, b: Int): Int = {
	  def loop(a: Int, acc: Int): Int = {
	    if (a > b) acc
	    else loop(a, f(a) + acc)
	  }
	  loop(a, 0)
	}                                         //> sum: (f: Int => Int)(a: Int, b: Int)Int
}