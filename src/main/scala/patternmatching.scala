object patternmatching {
  def main(args: Array[String]): Unit = {
    var a = 1
     a match{
       case 1 => println("one")
       case 2 => println("two")
       case _ => println("no")
     }
  }
}

//2
object $1{
  def main(args: Array[String]): Unit = {
    var result = search("hey")
    println(result)
  }
  def search(b:Any):Any = b match{
    case 1 => println("one")
    case "two" => println("two")
    case "hey" => println("Hey How r u")
    case _ => println("No")
  }
}

