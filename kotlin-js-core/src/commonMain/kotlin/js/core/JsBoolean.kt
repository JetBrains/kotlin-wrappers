@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.core

expect external class JsBoolean :
    JsAny

expect fun JsBoolean.toBoolean(): Boolean

expect fun Boolean.toJsBoolean(): JsBoolean
