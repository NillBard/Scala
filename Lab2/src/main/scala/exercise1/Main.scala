package exercise1

import exercise1.PatternMatching.{Paper, Rock, garry, updateFood}

object Main {
    def main(args: Array[String]): Unit ={
        println("--------------------HiOrder--------------------")
        println("nTimes",HigherOrder.testNTimes(HigherOrder.plus,5,10,5))
        println("AnonymousnTimes", HigherOrder.testAnonymousNTimes(5,10,5));
        println("--------------------Pattern---------------------------")
        println("IntToString",PatternMatching.testIntToString(5))
        println("testIsMaxAndMortiz", PatternMatching.testIsMaxAndMoritz("max"))
        println("testIsEven", PatternMatching.testIsEven(5))
        println("testWinsA",PatternMatching.testWinsA(Paper, Rock))
        println("testExtractMammalWeight", PatternMatching.testExtractMammalWeight(garry))
        println("testUpdateGood", PatternMatching.testUpdateFood( PatternMatching.Fish("garry", PatternMatching.Vegetables)))
        println("--------------------Functions---------------------------")
        println("testCircle", Functions.testCircle(2.4))
        println("testRectangleCurried", Functions.testRectangleCurried(2,4))
        println("testRectangleUc", Functions.testRectangleUc(2,4))
        println("--------------------classes---------------------------")
        println(Animal.apply("goldfish"))
        println(Animal.fish.eat(Meat()))
        println(Animal.knowAnimals("garry"))
        println(Food.apply("meat"))
    }
}
