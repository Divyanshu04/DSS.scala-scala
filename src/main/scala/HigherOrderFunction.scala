//Higher order function
//it is allow to create function composition,lambda function
//or anonymous function

object HigherOrderFunction {

  def main(args: Array[String]): Unit = {
    function6(10,add)
  }
  def function6(a:Int,b:Int=>AnyVal):Unit ={
    println(b(a))
  }
  def add(a:Int):Int={
    a+2
  }
}

// Composition of higher order function
object $1_a{
  def main(args: Array[String]): Unit = {
    var result = divide(substract(divide(multiply(add1(10)))))   //function composition
    println(result)
  }
  def add1(a:Int):Int ={
    a+2
  }
  def multiply(a:Int):Int={
    a*2
  }
  def divide(a:Int):Int = {
    a/3
  }
  def substract(a: Int):Int={
    a-2
  }
}

//3: Anonymous(lambda) function
//Anonymous function is a function that has no name but works as a function.
// It is good to create an anonymous function when you don't want to reuse it latter.
//we can create Anonymous function either by using
//1:  =>(rocket) , 2: _(underscore)
object $3_a{
  def main(args: Array[String]): Unit = {
    var result = (a:Int,b:Int) =>a+b
    var result1 = (_:Int)+(_:String)
   println(result(10,20))
    println(result1(10,"Rs."))
  }
}

//4: Multiline Expression
// Scala support multiline expression, but while using multiline expression be carefull
object $4_a{
  def main(args: Array[String]): Unit = {
    println(add11(10,20))
  }
  def add11(a:Int,b:Int)= {
  //a: wrong expression
    /*   a
   + b*/
//b: correct expression
    a+
   b
//c: correct expression
  /*  ( a
  + b)*/

  }
}

//5: Currying function
//https://dzone.com/articles/currying-functions-in-scala-1
//Example1
object $5_a{
  def addition(a:Int)(b:Int)={
    a+b
  }

  def main(args: Array[String]): Unit = {
    var result = addition(10)(10)
    println("10+10="+result)
    var addit = addition(10)_
    var result1 = addit(3)
    println("10+3 ="+result1)

  }
}
//Example2(without currying function)
object $5_b{
  def finalprice(vat:Double,Servicecharge:Double,productprice:Double):Double = {
    productprice+productprice*Servicecharge/100+productprice*vat/100
  }

  def main(args: Array[String]): Unit = {
    var result = finalprice(10.0,20.0,12)
    println(result)
  }
}

//above example with currying function
object $5_c{
  def finalprice1(vat1:Double)
   (Servicecharge1:Double)
    (Productprice1:Double):Double ={
    Productprice1+Productprice1*Servicecharge1/100+Productprice1*vat1/100
  }

  def main(args: Array[String]): Unit = {
    val v1 = finalprice1(10)_
    val s1 = v1(20)
    val f1 = s1(12)
    val f2 = s1(15)
    println(f1)
    println(f2)
  }
}

//7:
//How to use curried function to modify any function
object $7_a{
  def reduction(discount:Double,price:Double):Double={
    (1- discount/100)*price
  }

  def main(args: Array[String]): Unit = {
    val curriedreduction = (reduction _).curried
    println(reduction(3,45))
    val discountapplied = curriedreduction(6)
    val resduceprice = discountapplied(400)
    val resduceprice1 = discountapplied(450)
    println(resduceprice)
    println(resduceprice1)
  }
}

//8: Scala nested function
object $8_a{
  def add(a:Int,b:Int,c:Int)={    //first function
    def add1(x:Int,y:Int)={       // second function
      x+y
    }
    add1(a,add1(b,c))
  }

  def main(args: Array[String]): Unit = {
    var result = add(10,10,10)
    println(result)
  }
}

//9: variable length parameters
 object $9{
  def add(args:Int*)={
    var sum = 0
    for(a<- args)sum += a
    sum
  }

  def main(args: Array[String]): Unit = {

  }
  var sum = add (1,2,3,4,5,6)
  println(sum)
}