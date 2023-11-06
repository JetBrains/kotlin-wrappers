// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.aria

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AriaHasPopup {
    companion object {
        @JsValue("false")
        val `false`: AriaHasPopup

        @JsValue("true")
        val `true`: AriaHasPopup

        @JsValue("menu")
        val menu: AriaHasPopup

        @JsValue("listbox")
        val listbox: AriaHasPopup

        @JsValue("tree")
        val tree: AriaHasPopup

        @JsValue("grid")
        val grid: AriaHasPopup

        @JsValue("dialog")
        val dialog: AriaHasPopup
    }
}
