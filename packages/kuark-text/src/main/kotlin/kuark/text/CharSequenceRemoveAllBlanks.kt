package kuark.text

/**
 * 모든 공백 문자를 제거한다
 */
inline fun CharSequence.removeAllBlanks() = Regex("\\p{Z}").replace(this, "")
