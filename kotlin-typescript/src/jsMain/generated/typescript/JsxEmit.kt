// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface JsxEmit {
    companion object {
        @JsIntValue(0)
        val None: JsxEmit

        @JsIntValue(1)
        val Preserve: JsxEmit

        @JsIntValue(2)
        val React: JsxEmit

        @JsIntValue(3)
        val ReactNative: JsxEmit

        @JsIntValue(4)
        val ReactJSX: JsxEmit

        @JsIntValue(5)
        val ReactJSXDev: JsxEmit
    }
}
