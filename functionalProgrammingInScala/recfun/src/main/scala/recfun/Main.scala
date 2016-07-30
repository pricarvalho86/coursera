package recfun

object Main {

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(col: Int, row: Int): Int = {
    if (col == 0 || col == row) 1
    else pascal(col, row - 1) + pascal(col - 1, row - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def verify(characters: List[Char], open: Int = 0, close: Int = 0): Boolean = {
      if (characters.isEmpty) open == close
      else if (close > open) false
      else {
        characters.head.toString() match {
          case "(" if (open >= close) => verify(characters.tail, open + 1, close)
          case ")" => verify(characters.tail, open, close + 1)
          case _ => verify(characters.tail, open, close)
        }
      }
    }
    verify(chars);
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def calculate(m: Int, cs: List[Int], cnt: Int): Int =
      if (m < 0) cnt //Not a change, keep cnt
      else if (cs.isEmpty) {
        if (m == 0) cnt + 1 else cnt // plus cnt if find a change
      } else calculate(m, cs.tail, cnt) + calculate(m - cs.head, cs, cnt)
    calculate(money, coins, 0)
  }
}
