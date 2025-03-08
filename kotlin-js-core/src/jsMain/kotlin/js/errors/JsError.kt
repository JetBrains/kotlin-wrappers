@file:Suppress(
    "ACTUAL_WITHOUT_EXPECT",
)

package js.errors

actual typealias JsError = Throwable

actual inline fun JsError.toThrowable(): Throwable =
    this

actual fun Throwable.toJsError(): JsError =
    this
