package kuark.logging

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import kotlin.reflect.KClass

/**
 * 전달받은 [name]으로 [Logger]를 생성한다
 */
fun createLogger(name: String): Logger = LoggerFactory.getLogger(name)

/**
 * 전달받은 [clazz]의 이름으로 [Logger]를 생성한다
 */
fun createLogger(clazz: KClass<*>): Logger = LoggerFactory.getLogger(clazz.java)

/**
 * 전달받은 [clazz]의 이름으로 [Logger]를 생성한다
 */
fun createLogger(clazz: Class<*>): Logger = LoggerFactory.getLogger(clazz)

/**
 * 선언된 위치의 클래스 명을 추론하여 [Logger]를 생성한다
 *
 * ```kotlin
 * package com.example
 *
 * class MyClass {
 *  val logger = createLogger {} // com.example.MyClass
 * }
 * ```
 */
fun createLogger(lambda: () -> Unit): Logger {
  val javaClassName = lambda.javaClass.name

  val name = when {
    javaClassName.contains("Kt$") -> javaClassName.substringBefore("Kt$")
    javaClassName.contains("$") -> javaClassName.substringBefore("$")
    else -> javaClassName
  }

  return LoggerFactory.getLogger(name)
}
