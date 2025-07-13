@file:Suppress(
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package js.errors

@PublishedApi
internal fun createJsException(
    thrownValue: JsAny?,
): Throwable =
    JsException(thrownValue)
