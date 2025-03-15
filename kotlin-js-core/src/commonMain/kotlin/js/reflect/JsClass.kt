@file:Suppress(
    "EXPECTED_EXTERNAL_DECLARATION",
)

package js.reflect

import js.core.JsAny

expect external interface JsClass<T : JsAny> :
    JsAny {

    val name: String
}
