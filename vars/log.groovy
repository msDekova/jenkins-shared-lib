#!/usr/bin/env groovy
import static Ansi.*

def err(String message) {
  println color("[ERROR]: ${message}", Ansi.LIGHT_BLUE)
}

def info(String message) {
  println "[INFO]: ${message}"
}

def warning(String message) {
  println "[WARNING]: ${message}"
}
