// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package react.dom.svg

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface FillRule {
    companion object {
        @JsValue("nonzero")
        val nonzero: FillRule

        @JsValue("evenodd")
        val evenodd: FillRule

        @JsValue("inherit")
        val inherit: FillRule
    }
}
