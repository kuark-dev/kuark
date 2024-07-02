package kuark.secret

/**
 * 민감한 숫자가 의도치 않게 노출되는 것을 막기 위해 [toString] 메서드를 오버라이드하여 "******"로 대체한 밸류 클래스
 *
 * @author dungsil
 * @since 1.0.0
 */
@JvmInline
@Suppress("MemberVisibilityCanBePrivate")
value class SecretNumber(val value: Number) {
  override fun toString(): String = "******"
}
