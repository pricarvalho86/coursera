object teste {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(175); 

	def sum(f: Int => Int)(a: Int, b: Int): Int = {
	  def loop(a: Int, acc: Int): Int = {
	    if (a > b) acc
	    else loop(a, f(a) + acc)
	  }
	  loop(a, 0)
	};System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""")}
}
