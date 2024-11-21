// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

sealed external interface GPUCompareFunction {
    companion object {
        @JsValue("always")
        val always: GPUCompareFunction

        @JsValue("equal")
        val equal: GPUCompareFunction

        @JsValue("greater")
        val greater: GPUCompareFunction

        @JsValue("greater-equal")
        val greaterEqual: GPUCompareFunction

        @JsValue("less")
        val less: GPUCompareFunction

        @JsValue("less-equal")
        val lessEqual: GPUCompareFunction

        @JsValue("never")
        val never: GPUCompareFunction

        @JsValue("not-equal")
        val notEqual: GPUCompareFunction
    }
}
