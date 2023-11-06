// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ElementFlags {
    companion object {
        @JsIntValue(1)
        val Required: ElementFlags

        @JsIntValue(2)
        val Optional: ElementFlags

        @JsIntValue(4)
        val Rest: ElementFlags

        @JsIntValue(8)
        val Variadic: ElementFlags

        @JsIntValue(3)
        val Fixed: ElementFlags

        @JsIntValue(12)
        val Variable: ElementFlags

        @JsIntValue(14)
        val NonRequired: ElementFlags

        @JsIntValue(11)
        val NonRest: ElementFlags
    }
}
