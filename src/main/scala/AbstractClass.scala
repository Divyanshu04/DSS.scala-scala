// An abstract class can have abstract methods and non-abstract methods as well.
// Abstraction is a process in which we hide complex implementation details and show only functionality to the user.
// In scala, we can achieve abstraction by using abstract class and trait.

abstract class car {
  def run()       //abstract method
}
 class suzuki extends car{
   def run(): Unit ={           // Non Abstract method
     println("Running fine....")
   }
 }

object $car1{
  def main(args: Array[String]): Unit = {
    var h = new suzuki()
    h.run()
  }
}

//Abstract Class having constructor,variable,methods
abstract class car1(a:Int){     //create constructor
  var b:Int =20                 //creating variable
  var c:Int = 25
  def run()                     //Abstract method
  def performance(): Unit ={     // Non Abstract method
    println("awesome performance")
  }
}

class brand(a:Int)extends car1(a){
  c=30
  def run(): Unit ={
    println("running fine....")
    println("a ="+a)
    println("b ="+b)
    println("c ="+c)
  }
}
object $brand1{
  def main(args: Array[String]): Unit = {
    var h = new brand(10)
    h.run()
    h.performance()
  }
}

// Abstract Method is not implemented in class


//
abstract class car3{
  def run(){}      // Abstract method with implementation
}
class brand5 extends car3{
  def run1(): Unit ={            //Non Abstract (not implemented in class)
    println("running fine....")
  }
}
object $r1{
  def main(args: Array[String]): Unit = {
    var g = new brand5()
    g.run1()
  }
}

