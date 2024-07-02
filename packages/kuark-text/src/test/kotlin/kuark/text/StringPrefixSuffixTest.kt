package kuark.text

import kotlin.test.Test
import kotlin.test.assertEquals

internal class StringPrefixSuffixTest {
  @Test
  fun testPrefixIf() {
    val str = "world"
    val prefix = "hello"
    val resultStr = str.prefixIf(prefix) { true }
    assertEquals("helloworld", resultStr)

    val resultStr2 = str.prefixIf(prefix) { false }
    assertEquals("world", resultStr2)
  }

  @Test
  fun testPrefixIfNot() {
    val str = "world"
    val prefix = "hello"
    val resultStr = str.prefixIfNot(prefix)
    assertEquals("helloworld", resultStr)

    val resultStr2 = "helloworld".prefixIfNot(prefix)
    assertEquals("helloworld", resultStr2)
  }

  @Test
  fun testSuffixIf() {
    val str = "hello"
    val suffix = "world"
    val resultStr = str.suffixIf(suffix) { true }
    assertEquals("helloworld", resultStr)

    val resultStr2 = str.suffixIf(suffix) { false }
    assertEquals("hello", resultStr2)
  }

  @Test
  fun testSuffixIfNot() {
    val str = "hello"
    val suffix = "world"
    val resultStr = str.suffixIfNot(suffix)
    assertEquals("helloworld", resultStr)

    val resultStr2 = "helloworld".suffixIfNot(suffix)
    assertEquals("helloworld", resultStr2)
  }
}
