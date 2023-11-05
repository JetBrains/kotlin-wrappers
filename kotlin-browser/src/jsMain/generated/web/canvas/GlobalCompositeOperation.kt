// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.canvas

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface GlobalCompositeOperation {
    companion object {
        @JsValue("color")
        val color: GlobalCompositeOperation

        @JsValue("color-burn")
        val colorBurn: GlobalCompositeOperation

        @JsValue("color-dodge")
        val colorDodge: GlobalCompositeOperation

        @JsValue("copy")
        val copy: GlobalCompositeOperation

        @JsValue("darken")
        val darken: GlobalCompositeOperation

        @JsValue("destination-atop")
        val destinationAtop: GlobalCompositeOperation

        @JsValue("destination-in")
        val destinationIn: GlobalCompositeOperation

        @JsValue("destination-out")
        val destinationOut: GlobalCompositeOperation

        @JsValue("destination-over")
        val destinationOver: GlobalCompositeOperation

        @JsValue("difference")
        val difference: GlobalCompositeOperation

        @JsValue("exclusion")
        val exclusion: GlobalCompositeOperation

        @JsValue("hard-light")
        val hardLight: GlobalCompositeOperation

        @JsValue("hue")
        val hue: GlobalCompositeOperation

        @JsValue("lighten")
        val lighten: GlobalCompositeOperation

        @JsValue("lighter")
        val lighter: GlobalCompositeOperation

        @JsValue("luminosity")
        val luminosity: GlobalCompositeOperation

        @JsValue("multiply")
        val multiply: GlobalCompositeOperation

        @JsValue("overlay")
        val overlay: GlobalCompositeOperation

        @JsValue("saturation")
        val saturation: GlobalCompositeOperation

        @JsValue("screen")
        val screen: GlobalCompositeOperation

        @JsValue("soft-light")
        val softLight: GlobalCompositeOperation

        @JsValue("source-atop")
        val sourceAtop: GlobalCompositeOperation

        @JsValue("source-in")
        val sourceIn: GlobalCompositeOperation

        @JsValue("source-out")
        val sourceOut: GlobalCompositeOperation

        @JsValue("source-over")
        val sourceOver: GlobalCompositeOperation

        @JsValue("xor")
        val xor: GlobalCompositeOperation
    }
}
