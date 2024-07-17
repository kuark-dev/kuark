package kuark.text


/**
 * [func]의 결과가 `true` 이면 [prefix] 를 문자열 앞에 추가한 새로운 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
fun String.prefixIf(prefix: String, func: () -> Boolean): String = if (func()) {
  "$prefix$this"
} else {
  this
}
