@file:Suppress(
    "INVISIBLE_REFERENCE",
)

package js.errors.internal

internal fun createJsException(
    thrownValue: JsAny?,
): Throwable =
    JsException(thrownValue)
