package js.string

actual object JsStrings {
    actual inline fun JsString.toKotlinString(): String =
        toString()
}
