package kuark.text


/**
 * [func]의 결과가 `true` 이면 [prefix] 를 문자열 앞에 추가한 새로운 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
fun String.prefixIf(prefix: String, func: () -> Boolean): String = if (func()) {
  "$prefix$this"
} else {
  this
}

/**
 * 현재 문자열의 [prefix]가 존재하지 않는 경우 [prefix]를 추가한 새 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
fun String.prefixIfNot(prefix: String): String = this.prefixIf(prefix) { this.startsWith(prefix).not() }

/**
 * [func]의 결과가 `true` 이면 [suffix] 를 문자열 뒤에 추가한 새로운 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
fun String.suffixIf(suffix: String, func: () -> Boolean): String = if (func()) {
  "$this$suffix"
} else {
  this
}

/**
 * 현재 문자열의 [suffix]가 존재하지 않는 경우 [suffix]를 추가한 새 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
fun String.suffixIfNot(suffix: String): String = this.suffixIf(suffix) { this.endsWith(suffix).not() }
