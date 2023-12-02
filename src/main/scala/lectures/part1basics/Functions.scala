package lectures.part1basics

/**
 * Created by suelspahiu on 12/2/23 @ 1:14 AM
 */
object Functions extends App {

  def aFunction(a:String, b:Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
//  println(aParameterlessFunction) //no more allowed in scala 3

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello-",3))

}
