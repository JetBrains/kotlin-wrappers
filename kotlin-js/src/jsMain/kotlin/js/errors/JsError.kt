package js.errors

actual typealias JsError = Throwable

actual inline fun JsError.toThrowable(): Throwable =
    this
