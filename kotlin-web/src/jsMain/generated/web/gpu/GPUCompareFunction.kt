// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue

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
