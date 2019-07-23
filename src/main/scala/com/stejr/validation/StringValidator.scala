package com.stejr.validation

class StringValidator {
  def isUppercase(string: String, failureMessage: String = "Not uppercase"): Either[String, String] = {
    if (string.toUpperCase == string) Right(string) else Left(failureMessage)
  }


}

object StringValidator {
  def apply(): StringValidator = new StringValidator()
}
