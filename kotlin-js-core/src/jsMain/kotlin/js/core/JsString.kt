@file:Suppress(
    "ACTUAL_WITHOUT_EXPECT",
)

package js.core

actual typealias JsString = String

actual fun String.toJsString(): JsString = this
