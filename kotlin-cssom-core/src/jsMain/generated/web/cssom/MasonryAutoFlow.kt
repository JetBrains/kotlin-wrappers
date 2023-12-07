// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MasonryAutoFlow {
    companion object {
        @JsValue("definite-first")
        val definiteFirst: MasonryAutoFlow

        @JsValue("next")
        val next: MasonryAutoFlow

        @JsValue("ordered")
        val ordered: MasonryAutoFlow

        @JsValue("pack")
        val pack: MasonryAutoFlow
    }
}
