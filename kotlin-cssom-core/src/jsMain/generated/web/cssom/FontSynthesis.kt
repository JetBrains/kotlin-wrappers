// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FontSynthesis {
    companion object {
        @JsValue("small-caps")
        val smallCaps: FontSynthesis

        @JsValue("style")
        val style: FontSynthesis

        @JsValue("weight")
        val weight: FontSynthesis
    }
}
