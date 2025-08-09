@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
    "INTERFACE_WITH_SUPERCLASS",
)

package js.reflect

import js.core.JsAny

expect external interface JsClass<T : JsAny> :
    JsAny {

    val name: String
}

internal expect fun <T : JsAny> isInstanceOf(
    value: JsAny,
    jsClass: JsClass<T>,
): Boolean
