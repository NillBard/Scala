object Main {
  def main(args: Array[String])={
    println(Typeclasses.testReversableString("asd"))
    println(Typeclasses.testSmashInt(5,12))
    println(Typeclasses.testSmashDouble(6.2,8.1))
    println(Typeclasses.testSmashString("asd","sda"))
  }
}
