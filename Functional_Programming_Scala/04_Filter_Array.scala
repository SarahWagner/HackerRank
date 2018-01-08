/* TASK: Filter a given array of integers and output only those values that are less than a specified value . The output integers should be in the same sequence as they were in the input. The purpose of this challenge is to learn how to write your own implementation of a filter function. */

def f(delim: Int, arr: List[Int]): List[Int] = {
      arr match  {
          case x :: y => if(arr.head < delim) arr.head :: f(delim, arr.tail) 
                         else f(delim, arr.tail)
          case Nil => Nil
      }
 }