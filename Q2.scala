object question_02{
    def main(args: Array[String]): Unit = {
         print("Enter Number= ")
         val num: Int = scala.io.StdIn.readInt()
         println(result(num))
    }
    def result(num: Int): String = {
        if(num <= 0){
          "Nagative/Zero"  
        }
        else{
            if(num % 2==0){
                "Even Number"
            }
            else{
                "Odd Number"
            }
        }
    }
    }

 
