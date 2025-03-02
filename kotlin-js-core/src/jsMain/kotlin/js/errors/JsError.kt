package js.errors

actual typealias JsError = Throwable

actual fun JsError.toThrowable(): Throwable =
    this
