// Automatically generated - do not modify!

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
