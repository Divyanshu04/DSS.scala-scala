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

// 13:Constructor overloading
class $13(id:Int){
  def this(id:Int,name:String)={
    this(id)
    println(id+""+name)
  }
  println(id)
}
object $13_c{
  def main(args: Array[String]): Unit = {
    new $13(101)
    new $13(100,"name")
  }
}

//14:method overloading:
// method with same name but different parameter and data types
class $14_a{
  def add(a:Int,b:Int): Unit ={
    var sum = a+b
    println(sum)
  }
 // def add(a:Int,b:Int,c:Int): Unit ={       //overloading with same data type
  def add(a:Double,b:Double,c:Int){           //overloading with different data type
    var sum = a+b+c
    println(sum)
  }
}
object $14{
  def main(args: Array[String]): Unit = {
    var a = new $14_a()
    a.add(10,20)
    a.add(10,12,13)
  }
}

// 15:This keyword in scala
//this is a keyword and used to refer current object.
//You can call instance variables, methods, constructors by using this keyword.

class $15_a{
  var id:Int = 0
  var name:String = ""
  def this(id:Int,name:String){
    this()
    this.id = id
    this.name = name
  }
  def show(): Unit ={
    println(id+ " "+name)
  }
}
object $15{
  def main(args: Array[String]): Unit = {
    var x = new $15_a(44,"singh")
  x.show()
  }

}

//Scala Inheritance:
class employee{
  var salary:Float = 10000
  }

class programmer extends employee{
  var bonus:Int = 5000
  println("salary ="+salary)
  println("Bonus ="+bonus)

}
object $15_b{
  def main(args: Array[String]): Unit = {
    new programmer
  }
}

// 16:method overriding
//subclass has the same name method as
// defined in the parent class
//we provide a specific implementation for the method
//defined in the parent class

class $16_a{
  def run(): Unit ={
    println("we all are moving")
  }
}
class $16_b extends $16_a{
  override def run(): Unit ={
    println("going for trip")
  }
}
object $16_c{
  def main(args: Array[String]): Unit = {
    var b = new $16_b
    b.run()
  }
}

// Example for overriding method
class bank{
  def ROI() ={
    0
  }
}
class SBI extends bank{
  override def ROI(): Int ={
    5
  }
}
class ICICI extends bank{
  override def ROI(): Int ={
    6
  }
}
class AXIS extends bank{
  override def ROI(): Int ={
    8
  }
}
object RBI{
  def main(args: Array[String]): Unit = {
    var m = new SBI()
    var n = new ICICI()
    var o = new AXIS()
    println("SBI ROI "+m.ROI())
    println("ICICI ROI "+n.ROI())
    println("AXIS ROI "+o.ROI())
  }
}

//SCALA field overriding
// In Scala you can override fields also we should follw some rule
//Rule1: Mutable variable(var) can not be overridden
/*class vehicle{
  var speed:Int = 60
}
class bike extends vehicle{
  override var speed:Int = 100
  def show(){
  println(speed)
}}
object $44{
  def main(args: Array[String]): Unit = {
    var b = new bike()

  }
}*/
//Rule2:
class vehicle1{
  val speed:Int =30
}
class bike1 extends vehicle1 {
  override val speed:Int =100 // overide keyword
  def show(): Unit = {
    println(speed)
  }
}
  object $44_q{
    def main(args: Array[String]): Unit = {
      var b = new bike1()
      b.show()
    }

}
//Rule3: mutable variable can noy be overridden
/*
class Vehicle2{
  var speed:Int = 60
}
class Bike2 extends Vehicle2{
  override var speed:Int = 100
  def show(){
    println(speed)
  }
}
object MainObject{
  def main(args:Array[String]){
    var b = new Bike2()
    b.show()
  }
}
*/
// Rule4:
/*
class vehicle5{
  val speed:Int= 40
}
class bike5 extends vehicle5{
  override var speed:Int = 100
  def show(): Unit ={
    println(speed)
  }
}
object dd{
  def main(args: Array[String]): Unit = {
    var f = new bike5()
    f.show()
  }
}*/
