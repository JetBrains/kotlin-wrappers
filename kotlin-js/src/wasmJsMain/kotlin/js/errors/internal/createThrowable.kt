@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.errors.internal

import kotlin.js.JsError as InternalJsError

internal fun createThrowable(
    thrownValue: JsAny?,
): Throwable {
    val linkedException = if (thrownValue is InternalJsError) {
        thrownValue.kotlinException?.get()
    } else null

    return linkedException
        ?: JsException(thrownValue)
}
