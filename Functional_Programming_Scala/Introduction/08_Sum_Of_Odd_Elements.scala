/* TASK: You are given a list. Return the sum of odd elements from the given list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature. */

def f(arr: List[Int]): Int = {

arr.filter(_ % 2 != 0).sum

}