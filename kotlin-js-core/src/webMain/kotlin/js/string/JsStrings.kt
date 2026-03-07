package js.string

import kotlin.js.JsString

expect object JsStrings {
    inline fun JsString.toKotlinString(): String
}
