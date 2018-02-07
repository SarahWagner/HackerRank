/* TASK: You are given a list of  elements. Reverse the list without using the reverse function. */

def f(arr: List[Int]): List[Int] = {
        
    arr match {
            
        case Nil => Nil
        case y :: z => arr.last :: f(arr.init)
            
    }
}
