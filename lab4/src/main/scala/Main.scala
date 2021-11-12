object Main {
    def main(args:Array[String]):Unit = {
        println("----------------Adts----------------")
        println(Adts.testGetNth(List(1,2,3,4,5,6,7,8,9,10),5))
        println(Adts.testDouble(Some(5)))
        println( Adts.testIsEven(9))
        println(Adts.testSafeDivide(10,0))
        println( Adts.testGoodOldJava(_.toInt, "123"))
        
        println("----------------Maps----------------")
        println(Maps.testGroupUsers(Seq(Maps.User("Adam", 36) , Maps.User("Andrew", 42), Maps.User("Jony", 27), Maps.User("Kaney", 18))))
        println(Maps.testNumberFrodos {
            Map("First User" -> Maps.User("Adam", 36), "Second User" -> Maps.User("Andrew", 42), "Third User" -> Maps.User("Jony", 27), "Fourth User" -> Maps.User("Kaney", 18))
        })
        println(Maps.testUnderaged {
            Map("First User" -> Maps.User("Adam", 36), "Second User" -> Maps.User("Andrew", 42), "Third User" -> Maps.User("Jony", 27), "Fourth User" -> Maps.User("Kaney", 18))
        })
        println("----------------Sequence----------------")
        println(Sequence.testLastElement(Seq(1,2,3,4,5,6)))
        println(Sequence.testZip(Seq(1,2), Seq(3,4,5,6)))
        println(Sequence.testForAll(Seq(1,2,3,4,5,6))( _ >= 3))
        println(Sequence.testPalindrom(Seq(1,2,3,2,1)))
        println(Sequence.testFlatMap(Seq(1,2,3,4,5,6))(value => Seq(value * 2)))
        
        println("----------------String----------------")
        println(Strings.testUppercase("lmao"))
        println(Strings.testInterpolations("Daniil", 19))
        println(Strings.testComputation(5,10))
        println(Strings.testTakeTwo("l"))
    }
}
