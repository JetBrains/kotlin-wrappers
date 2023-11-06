// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.svg

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface StrokeLinejoin {
    companion object {
        @JsValue("miter")
        val miter: StrokeLinejoin

        @JsValue("round")
        val round: StrokeLinejoin

        @JsValue("bevel")
        val bevel: StrokeLinejoin

        @JsValue("inherit")
        val inherit: StrokeLinejoin
    }
}
