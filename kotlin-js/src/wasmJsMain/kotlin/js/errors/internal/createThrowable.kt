@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.errors.internal

@PublishedApi
internal fun createThrowable(
    thrownValue: JsAny?,
): Throwable =
    JsException(thrownValue)
