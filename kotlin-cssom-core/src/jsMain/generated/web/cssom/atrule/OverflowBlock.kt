// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom.atrule

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface OverflowBlock {
    companion object {
        @JsValue("none")
        val none: OverflowBlock

        @JsValue("scroll")
        val scroll: OverflowBlock

        @JsValue("optional-paged")
        val optionalPaged: OverflowBlock

        @JsValue("paged")
        val paged: OverflowBlock
    }
}
