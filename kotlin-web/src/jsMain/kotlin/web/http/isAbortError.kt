package web.http

import web.errors.DOMException

private const val ABORT_ERROR = "AbortError"

internal fun Throwable.isAbortError(): Boolean =
    this is DOMException && name == ABORT_ERROR
