// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface WillChange {
    companion object {
        @JsValue("contents")
        val contents: WillChange

        @JsValue("scroll-position")
        val scrollPosition: WillChange
    }
}
