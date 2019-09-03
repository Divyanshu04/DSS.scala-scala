//In scala, functions are first class values.
// syntax: def functionName(parameters : typeofparameters) : returntypeoffunction = {
// statement to be executed
// }
//Types of Function 1: Non parametrize , 2: parameterize
//Note: ifyou will use equal(=) operator function will return value
// otherwise it will not return anything and will work like subroutine.
// example of Non Parameterize function(i.e not using =)
//1
object Function {
  def main(args: Array[String]){
    function1()
  }
  def function1(){
    println("this is my own house")
  }
}
//2: by using equal(=)
object $12{
  def main(args: Array[String]){
    var result = function2()
    println(result)
  }
  def function2() = {
    var a = 10
     a
  }
}
//3: Parameterized function
object $3{
  def main(args: Array[String]) = {
    function3(10,"Rs.")
  }
  def function3(a:Int,b:String)={
    var c = a+b
    println(s"give me "+ c)
  }
}

//4: recursion function
object $44
{
  def main(args: Array[String]): Unit = {
    var result = function4(22,5)
    println(result)
  }
  def function4(a:Int,b:Int):Int={
    if (b == 0)
      0
    else
      a+function4(a,b-1)

  }
}

//5:Scala parameter with  default value
object $5_1 {
  def main(args: Array[String]) = {
    var result1 =function5(15,2)
    var result2 = function5(15)
    var result3 = function5()
    println(result1+"\n"+result2+"\n"+result3)
  }
  def function5(a:Int = 0,b:Int = 0):Int ={
    var c = a+b
    c
  }
}

//6:
object $6_1 {
  def main(args: Array[String]) = {
    var result1 =function5(a=15,b=2)
    var result2 = function5(b=15,a=2)
    var result3 = function5(15,2)
    println(result1+"\n"+result2+"\n"+result3)
  }
  def function5(a:Int,b:Int):Int ={
    var c = a+b
    c
  }
}