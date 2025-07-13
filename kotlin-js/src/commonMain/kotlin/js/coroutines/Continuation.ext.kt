package js.coroutines

import js.errors.JsError
import js.errors.JsErrorLike
import js.errors.toThrowable
import kotlin.coroutines.Continuation
import kotlin.coroutines.resumeWithException

inline fun Continuation<*>.resumeWithError(error: JsErrorLike?): Unit =
    resumeWithException(error.toThrowable())

inline fun Continuation<*>.resumeWithError(error: JsError): Unit =
    resumeWithException(error.toThrowable())
