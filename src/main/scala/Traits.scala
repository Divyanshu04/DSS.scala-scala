//Traits: A trait is like an interface with a partial implementation.
//trait is a collection of abstract and non-abstract methods.
//create trait that can have all abstract methods or some abstract and some non-abstract methods.
//A variable that is declared either by using val or var keyword in a trait get internally implemented in the class that implements the trait. Any variable
// which is declared by using val or var but not initialized is considered abstract.
//Traits are compiled into Java interfaces with corresponding implementation classes that hold any methods implemented in the traits.

trait Traits {
def print()
}
class A4 extends Traits{
  def print(): Unit ={
    println("heello")
  }
}

object $t1{
  def main(args: Array[String]): Unit = {
    var a = new A4()
    a.print()
  }
}

//2:
trait $2{
  def print1()
}
abstract class A5 extends $2{
  def print2(): Unit ={
    println("heyy,this is A4  sheet")
  }
}
object $t_2{
  def main(args: Array[String]): Unit = {
  }
}

//**********************************************************
//3: Sequence for extends traits: it will extend the first trait, class, abstract class.
trait Printable{
  def print()
}

trait Showable{
  def show()
}

class A6 extends Printable with Showable{
  def print(){
    println("This is printable")
  }
  def show(){
    println("This is showable");
  }
}

object MainObject{
  def main(args:Array[String]){
    var a = new A6()
    a.print()
    a.show()
  }
}