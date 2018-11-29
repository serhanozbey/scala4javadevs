package com.serhan.learning.scala4javadevs

import org.scalatest.{FlatSpec, Matchers}

class TourOfSyntax2Test extends FlatSpec with Matchers{

  "A Car " should "be able to add passengers" in{
    val parent = new TourOfSyntax2
    val car1 = new parent.Car(3,"Ferrari")
    car1 addPassenger 4
    car1.passengers should be (7)
  }

  //collection
  "Collections" should "print with stream foreach" in{
    val x = new TourOfSyntax2
    x.printListAndMapWithForEach()
  }


  "Collections" should "print with for loops" in{
    val x = new TourOfSyntax2
    x.printListAndMapFor()
  }

  "Collections" should "print with for but reversed" in {
    val x = new TourOfSyntax2
    x.printListReversed()
  }



}
