//1:
class _1{
  var id:Int=0
  var name = null
}
object abc {
  def main(args: Array[String]): Unit = {
    var a = new _1()
    println(a.id+ "  " +a.name)
  }
}

//2:
class _2(id:Int,name:String){       //primary constructor
  def show(){
    println(id+" "+name)
  }
}
object abc1{
  def main(args: Array[String]): Unit = {
    var s = new _2(100,"divyanshu")
    print(s.show())
  }
}

// Scala Anonymous object
class Arithmetic {
  def add(a: Int, b: Int): Unit = {
    var add = a + b
    println("sum = " + add)
  }
}
  object $3_s{
    def main(args: Array[String]): Unit = {
     /* var b = new Arithmetic
      println(b.add(2,3))*/
    new Arithmetic().add(10,20)

    }

  }
// Singleton object
//Singleton object is an object which is declared by using object keyword instead by class.
// No object is required to call methods declared inside singleton object.
//In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
//If you don't create singleton object, your code will compile successfully but will not produce any output.
// Methods declared inside Singleton Object are accessible globally. A singleton object can extend classes and traits.
object Main{
  def sayHi(): Unit ={
    println("Hi!")
  }

  def main(args: Array[String]): Unit = {
    Main.sayHi()
  }
}

//Companion object:
//When a singleton object is named the same as a class, it is called a companion object.
// A companion object must be defined inside the same source file as the class. Here is an example:
 class xyz1{
  def hello(){
    println("hello this is companion class")
  }
}
object xyz1{
  def main(args: Array[String]): Unit = {
  //def say() {
    println("hi!")

}}

//11:case class:
//Case classes support pattern matching
case class name(a:Int,b:Int)
object $11_a{
  def main(args: Array[String]): Unit = {
    var c = name(10,10) // creating object of case class
  println("a "+c.a)
    println("b "+c.b)

  }

}

//11.b
//Note:A case class which has no arguments is declared as
// case object instead of case class.
// case object is serializeable by default.
trait D
case class name1(a:Int,b:Int) extends D
case class name2(a:Int) extends D  // case class
case object caseobject extends D   // case object
object $11_b{
  def main(args: Array[String]): Unit = {
    caseP(name1(20,32))
    caseP(name2(32))
    caseP(caseobject)
  }
  def caseP(x:D)= x match{
    case name1(x,y) => println("a ="+x+" b="+y)
    case name2(x) => println("a ="+x)
    case caseobject => println("No argument")
    case _ => println("none")
  }
}

// Constructor:In scala, constructor is not special method.
//Scala provides primary and any number of auxiliary constructors.
//Primary constructor
class student(id:Int,name:String){
  def showDetails(): Unit ={
    println(id+" "+name)
  }
}
object Mainobject{
  def main(args: Array[String]): Unit = {
    var s = new student(101,"Hey")
   s.showDetails()
  }
}

// Secondray Constructor(Auxiliry Constructor)
// Condition for Auxiliry Constructor:
//You must call primary constructor from inside the auxiliary constructor.
// this keyword is used to call constructor from other constructor. When
// calling other constructor make it first line in your constructor.
class master(id:Int,name:String){
  var age:Int = 0
  def Details(): Unit ={
    println(id+" "+name+" "+age)
  }
  def this(id:Int,name:String,age:Int){
    this(id,name)             //primary constructor
    this.age = age
  }
}
object $12_a{
  def main(args: Array[String]): Unit = {
    var f = new master(10,"xyz",34)
   f.Details()
  }
}