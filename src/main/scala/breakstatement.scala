//break staement:
//Break is used to break a loop or program execution. It skips the current execution. Inside
//inner loop it breaks the execution of inner loop.
//Note:In scala, there is no break statement but you can do it by using break method and by
// importing scala.util.control.Breaks._ package
import scala.util.control.Breaks._

object breakstatement {
  def main(args: Array[String]): Unit = {
    breakable {                    //Breakable method to avoid exception
      for(i<- 1 to 10 by 2){
        if(i==7)
          break()       //break used here
        else
          println(i)
      }

    }
  }
}

//2:
object $2{
  def main(args: Array[String]): Unit = {
    for(i<-1 to 3){
      breakable{
        for(j<- 1 to 3){
          if(i ==2 & j ==2)
            break()
          println(i+ "" + j)
        }
      }
    }
  }
}
