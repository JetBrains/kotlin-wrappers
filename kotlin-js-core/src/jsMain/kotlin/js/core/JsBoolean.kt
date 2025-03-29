@file:Suppress(
    "ACTUAL_WITHOUT_EXPECT",
)

package js.core

actual typealias JsBoolean = Boolean

actual fun JsBoolean.toBoolean(): Boolean = this

actual fun Boolean.toJsBoolean(): JsBoolean = this
