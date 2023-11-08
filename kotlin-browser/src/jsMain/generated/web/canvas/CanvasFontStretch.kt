// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface CanvasFontStretch {
    companion object {
        @JsValue("condensed")
        val condensed: CanvasFontStretch

        @JsValue("expanded")
        val expanded: CanvasFontStretch

        @JsValue("extra-condensed")
        val extraCondensed: CanvasFontStretch

        @JsValue("extra-expanded")
        val extraExpanded: CanvasFontStretch

        @JsValue("normal")
        val normal: CanvasFontStretch

        @JsValue("semi-condensed")
        val semiCondensed: CanvasFontStretch

        @JsValue("semi-expanded")
        val semiExpanded: CanvasFontStretch

        @JsValue("ultra-condensed")
        val ultraCondensed: CanvasFontStretch

        @JsValue("ultra-expanded")
        val ultraExpanded: CanvasFontStretch
    }
}
