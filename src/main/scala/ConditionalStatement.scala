object ConditionalStatement {
  var x:Int = 20
  var y = 25
  def main(args: Array[String]): Unit = {
  }
  if (x>y){
    println(" wrong Answer")

  }
  else{
    println("correct answer")

  }
}

//2
object _2{
  def main(args: Array[String]): Unit = {

  }
  var number = 21
if (number%2 == 0){
  print("even")
}
else{
  println("odd")
}
}
//3

object _3{

  def main(args: Array[String]): Unit = {}
  val number1:Int = 55
  if(number1>=0 && number1<50){
    println("fail")
  }
  else if(number1>=50 && number1<60){
    println("D Grade")
  }
  else if(number1>=60 && number1<70){
    println("C grade")
  }
  else if(number1>=70 && number1<80){
    println("b grade")
  }
  else if(number1>=80 && number1<90){
    println("A grade")
  }
  else if(number1>=90 && number1<=100){
    println("A+ Grade")
  }
  else println("Invalid")
}

//4
object $4{
  def one(a:Int) = if(a>=0) 1 else -1

  def main(args: Array[String]): Unit = {}
    val result = one(+10)
    println(result)

}

//5:While comdition
object $5{
  def main(args: Array[String]): Unit = {
    var a = 10
    while (a<=25){
      println(a)
      a = a+2
    }
  }
}
//6: do while condition
object $6 {
  def main(args: Array[String]): Unit = {
    var b = 10
    do {

      println(b)
      b = b+2

    }
    while (b <=20)
   // while(true)
  }

}