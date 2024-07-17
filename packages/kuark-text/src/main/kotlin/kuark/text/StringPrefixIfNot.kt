package kuark.text

/**
 * 현재 문자열의 [prefix]가 존재하지 않는 경우 [prefix]를 추가한 새 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
inline fun String.prefixIfNot(prefix: String): String = this.prefixIf(prefix) { this.startsWith(prefix).not() }
