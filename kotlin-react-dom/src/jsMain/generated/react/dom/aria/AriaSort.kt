// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.aria

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AriaSort {
    companion object {
        @JsValue("none")
        val none: AriaSort

        @JsValue("ascending")
        val ascending: AriaSort

        @JsValue("descending")
        val descending: AriaSort

        @JsValue("other")
        val other: AriaSort
    }
}
