// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.aria

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AriaAutoComplete {
    companion object {
        @JsValue("none")
        val none: AriaAutoComplete

        @JsValue("inline")
        val inline: AriaAutoComplete

        @JsValue("list")
        val list: AriaAutoComplete

        @JsValue("both")
        val both: AriaAutoComplete
    }
}
