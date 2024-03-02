// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUCompareFunction {
    companion object {
        @JsValue("never")
        val never: GPUCompareFunction

        @JsValue("less")
        val less: GPUCompareFunction

        @JsValue("equal")
        val equal: GPUCompareFunction

        @JsValue("less-equal")
        val lessEqual: GPUCompareFunction

        @JsValue("greater")
        val greater: GPUCompareFunction

        @JsValue("not-equal")
        val notEqual: GPUCompareFunction

        @JsValue("greater-equal")
        val greaterEqual: GPUCompareFunction

        @JsValue("always")
        val always: GPUCompareFunction
    }
}
