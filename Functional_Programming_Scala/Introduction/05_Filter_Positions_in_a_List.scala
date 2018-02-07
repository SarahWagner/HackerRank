/* TASK: For a given list with n integers, return a new list removing the elements at odd positions (0, 2, 4, ...). */

def f(arr: List[Int]): List[Int] = {
  
    arr.indices.collect { case index if index % 2 != 0 => arr(index) }.toList

}