package funsets


object teste {
  type Bla = Int => Boolean
	val anonfun1 = new Function1[Int, Boolean] {
     def apply(x: Int): Boolean = x == 1
   }                                              //> anonfun1  : Int => Boolean = <function1>

	
	
  def teste(bla: Bla, value:Int): Boolean = {
  	println("eu sou=->" + bla)
  	bla(value)
  }                                               //> teste: (bla: funsets.teste.Bla, value: Int)Boolean
  teste(Set(1.0), 1)                              //> eu sou=->Set(1.0)
                                                  //| res0: Boolean = true

}