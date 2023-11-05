// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface Loading {
    companion object {
        @JsValue("eager")
        val eager: Loading

        @JsValue("lazy")
        val lazy: Loading
    }
}
