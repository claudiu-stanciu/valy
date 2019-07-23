package com.stejr.validation

import org.scalatest.{FlatSpecLike, Matchers}

class StringValidatorSpec extends FlatSpecLike with Matchers{

  "isUppercase" should "validate an uppercased string as valid" in {
    val validator = StringValidator()
    val input = "ABC"
    val expected = Right(input)
    validator.isUppercase(input) shouldBe expected
  }

  it should "validate a cameCased string as invalid" in {
    val validator = StringValidator()
    val input = "aBC"
    val expected = Left("Not uppercase")
    validator.isUppercase(input) shouldBe expected

    val failMessage = "Not the correct format"
    val expectedWithMessage = Left(failMessage)
    validator.isUppercase(input, failMessage) shouldBe expectedWithMessage
  }
}
