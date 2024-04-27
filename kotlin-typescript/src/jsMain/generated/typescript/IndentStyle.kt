// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface IndentStyle {
    companion object {
        @JsIntValue(0)
        val None: IndentStyle

        @JsIntValue(1)
        val Block: IndentStyle

        @JsIntValue(2)
        val Smart: IndentStyle
    }
}
