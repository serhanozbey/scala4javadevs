package com.serhan.learning.scala4javadevs


object TourOfSyntax1{

  def main(args: Array[String]): Unit = {
    val immutableString = "Serhan"
    var mutableString = "Ozbey"

    mutableString = "Oezbey"

    println(add(5, 3))
    println(min(23424, 3))
  }

  //with return type
  def add(x: Int, y: Int): Int = {
    x + y
  }

  //inferred return type
  def min(x: Int, y: Int) = {
    if (x < y)
      x
    else
      y
  }

}
