package acadgild

 object Fibonacci {
     

//Fibonacci Series Using Recursion
  
  def fibonacci_recursion(n: Int): Int =
    {
    if (n <= 1) n
  
    else fibonacci_recursion(n-1) + fibonacci_recursion(n-2);
    }
          
//Fibonacci Series Using Standard Method
  
    def fibonacci_standard(n: Int): Int =
     {
          var a = 0
          var b = 1
          if( n == 0) a
          else 
                {
          for(i <- 2 to n) 
     {
          val c = a + b
          a = b
          b = c
     }
          b
                 }
      }
   }


//Main Class

 object MainClass {
   
   def main(args: Array[String]) = {

     println(" ******************FIBONACCI SERIES*********************")
   
   println("Enter the Nth digit in the sequence , which you to find !")  
   val input = scala.io.StdIn.readInt()
     
     println("Output : Using Fibonnaci Series")
     val num1 = Fibonacci.fibonacci_recursion(input)
     println(num1)
   
     
     println("Output : Using Standard Method")  
     val num2 = Fibonacci.fibonacci_standard(input)
      println(num2)
  
   
    }
  }