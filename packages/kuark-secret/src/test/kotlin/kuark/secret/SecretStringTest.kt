package kuark.secret

import kotlin.test.Test
import kotlin.test.assertEquals

class SecretStringTest {

  @Test
  fun `toString returns 6 asterisks`() {
    val secret = SecretString("super secret")
    assertEquals("******", secret.toString())
  }

  @Test
  fun `toString returns 6 asterisks for empty string`() {
    val secret = SecretString("")
    assertEquals("******", secret.toString())
  }
}
