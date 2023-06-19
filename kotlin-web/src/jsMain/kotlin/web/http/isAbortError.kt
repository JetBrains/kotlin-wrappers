package web.http

import js.errors.JsErrorName
import web.errors.DOMException

private val ABORT_ERROR = JsErrorName("AbortError")

internal fun Throwable.isAbortError(): Boolean =
    this is DOMException && name == ABORT_ERROR
