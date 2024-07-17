package kuark.text


/**
 * 현재 문자열의 [suffix]가 존재하지 않는 경우 [suffix]를 추가한 새 문자열을 반환하고, 그렇지 않으면 원래 문자열을 반환한다
 */
fun String.suffixIfNot(suffix: String): String = this.suffixIf(suffix) { this.endsWith(suffix).not() }
