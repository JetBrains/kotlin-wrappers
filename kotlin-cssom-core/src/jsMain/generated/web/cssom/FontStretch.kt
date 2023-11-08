// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FontStretch {
    companion object {
        @JsValue("condensed")
        val condensed: FontStretch

        @JsValue("expanded")
        val expanded: FontStretch

        @JsValue("extra-condensed")
        val extraCondensed: FontStretch

        @JsValue("extra-expanded")
        val extraExpanded: FontStretch

        @JsValue("normal")
        val normal: FontStretch

        @JsValue("semi-condensed")
        val semiCondensed: FontStretch

        @JsValue("semi-expanded")
        val semiExpanded: FontStretch

        @JsValue("ultra-condensed")
        val ultraCondensed: FontStretch

        @JsValue("ultra-expanded")
        val ultraExpanded: FontStretch
    }
}
