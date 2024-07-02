package kuark.secret

import kotlin.test.Test
import kotlin.test.assertEquals

class SecretNumberTest {

  @Test
  fun `toString returns 6 asterisks`() {
    val secret = SecretNumber(0)
    assertEquals("******", secret.toString())
  }

  @Test
  fun `toString returns 6 asterisks for empty string`() {
    val secret = SecretNumber(Long.MAX_VALUE)
    assertEquals("******", secret.toString())
  }
}
