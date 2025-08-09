@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.reflect

import js.core.JsAny
import js.internal.InternalApi

expect external interface JsClass<T : JsAny> :
    JsAny {

    val name: String
}

internal expect fun <T : JsAny> isInstanceOf(
    value: JsAny,
    jsClass: JsClass<T>,
): Boolean

@InternalApi
fun <T : JsAny> JsClass<T>.cast(
    value: JsAny,
): T {
    if (!isInstanceOf(value, this)) {
        throw ClassCastException("Value cannot be cast to $name")
    }

    return unsafeCast(value)
}
