package com.serhan.learning.scala4javadevs

class TourOfSyntax2 {


	//Operator overloading

	//Infix notation (check test)
	//inner class, works differently than Java
	class Car(var passengers: Int, val carName: String) {

		def addPassenger(x: Int) = {
			passengers += x
		}

		//infix method on action
		def doTheUnfix = {
			this addPassenger 5
		}


		def printItOut = {
			println("car model: "+carName)
			println(passengers)
		}
	}

	val list = List("a", "b", "c")
	val map = Map("a" -> 1, "b" -> 2)

	//Collections (check test)
	def printListAndMapWithForEach() = {

		list.foreach(println)
		map.foreach(println)
	}

	def printListAndMapFor() = {
		for (i <- list) println(i)
		for (j <- map) println(j)
	}

	def printListReversed() = {
		for (i <- list.reverse) println(i)
	}

	//Java interoperability

}

//Companion object:

	//object with the same name as a class or trait and is defined in the same source file as the associated file or trait.

	//An analog to a companion object in Java is having a class with static methods. In Scala you would move the static methods to a Companion object.
object TourOfSyntax2 {
	def main(args: Array[String]): Unit = {
		val obj = new TourOfSyntax2
		val car = new obj.Car(3,"Limousine")
		car addPassenger 5
		car printItOut
	}
}
