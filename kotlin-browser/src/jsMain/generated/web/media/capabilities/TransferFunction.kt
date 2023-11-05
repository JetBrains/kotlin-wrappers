// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.capabilities

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface TransferFunction {
    companion object {
        @JsValue("hlg")
        val hlg: TransferFunction

        @JsValue("pq")
        val pq: TransferFunction

        @JsValue("srgb")
        val srgb: TransferFunction
    }
}
