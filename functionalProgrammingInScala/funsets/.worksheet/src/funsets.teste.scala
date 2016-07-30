package funsets


object teste {
  type Bla = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(152); 
	val anonfun1 = new Function1[Int, Boolean] {
     def apply(x: Int): Boolean = x == 1
   };System.out.println("""anonfun1  : Int => Boolean = """ + $show(anonfun1 ));$skip(99); 

	
	
  def teste(bla: Bla, value:Int): Boolean = {
  	println("eu sou=->" + bla)
  	bla(value)
  };System.out.println("""teste: (bla: funsets.teste.Bla, value: Int)Boolean""");$skip(21); val res$0 = 
  teste(Set(1.0), 1);System.out.println("""res0: Boolean = """ + $show(res$0))}

}
