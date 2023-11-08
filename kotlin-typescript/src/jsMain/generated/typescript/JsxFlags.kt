// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface JsxFlags {
    companion object {
        @JsIntValue(0)
        val None: JsxFlags

        /** An element from a named property of the JSX.IntrinsicElements interface */
        @JsIntValue(1)
        val IntrinsicNamedElement: JsxFlags

        /** An element inferred from the string index signature of the JSX.IntrinsicElements interface */
        @JsIntValue(2)
        val IntrinsicIndexedElement: JsxFlags

        @JsIntValue(3)
        val IntrinsicElement: JsxFlags
    }
}
