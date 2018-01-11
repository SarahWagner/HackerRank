 /* TASK: Create an array of  integers, where the value of  is passed as an argument to the pre-filled function in your editor. This challenge uses a custom checker, so you can create any array of  integers. */
	
def f(num: Int) : List[Int] = {
	
    val list = List.fill(num)(util.Random.nextInt(10))
    return list
		
} 