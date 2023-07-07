object question_01{
    def main(args: Array[String]): Unit = {
        print("Deposite Amount(Rs)= ")
        val amount: Float = scala.io.StdIn.readFloat()
        val interest = calculateInterest(amount)
        println(s"The interest earned on a deposit of Rs. $amount is Rs. $interest")
    }

    def calculateInterest(depositAmount: Double): Double = {
        val flatRate1 = 0.02 // 2%
        val flatRate2 = 0.04 // 4%
        val flatRate3 = 0.035 // 3.5%
        val flatRate4 = 0.065 // 6.5%

        if (depositAmount <= 20000) {
          depositAmount * flatRate1
      } else if (depositAmount <= 200000) {
          depositAmount * flatRate2
      } else if (depositAmount <= 2000000) {
          depositAmount * flatRate3
      } else {
          depositAmount * flatRate4
      }
}

}