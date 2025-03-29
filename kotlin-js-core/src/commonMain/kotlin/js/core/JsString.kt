@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.core

expect external class JsString :
    JsAny

expect fun String.toJsString(): JsString
