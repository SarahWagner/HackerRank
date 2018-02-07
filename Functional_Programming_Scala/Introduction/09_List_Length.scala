/* TASK: Count the number of elements in an array without using count, size or length operators (or their equivalents). The input and output portions will be handled automatically by the grader. You only need to write a function with the recommended method signature. */

def f(arr: List[Int]): Int = {

  def iter(l: List[Int], n: Int): Int = {

    arr match {
      case Nil => n
      case x :: y => iter(l.tail, n + 1) 
      case x :: Nil => n + 1
    }

    iter(arr, 0)
 }
}


/* Or just */

def f(arr: List[Int]): Int = {
    
    arr.foldLeft(0)((x, y) => x + 1)
    
}
