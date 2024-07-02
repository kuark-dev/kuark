package kuark.logging

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * @author dungsil
 * @since 1.0.0
 */
class CreateLoggerTest {
  private val expectedName = CreateLoggerTest::class.qualifiedName

  companion object {
    private val companionObjectLogger = createLogger { }
  }

  @Test
  fun `createLogger with name`() {
    val logger = createLogger("test")

    assertEquals("test", logger.name)
  }

  @Test
  fun `createLogger with kotlin class`() {
    val logger = createLogger(CreateLoggerTest::class)

    assertEquals(expectedName, logger.name)
  }

  @Test
  fun `createLogger with java class`() {
    val logger = createLogger(CreateLoggerTest::class.java)

    assertEquals(expectedName, logger.name)
  }

  @Test
  fun `createLogger with lambda`() {
    val logger = createLogger { }
    assertEquals(expectedName, logger.name)
  }

  @Test
  fun `createLogger with companion object`() {
    assertEquals(expectedName, companionObjectLogger.name)
  }
}
