// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WhiteSpace {
    companion object {
        @JsValue("break-spaces")
        val breakSpaces: WhiteSpace

        @JsValue("normal")
        val normal: WhiteSpace

        @JsValue("nowrap")
        val nowrap: WhiteSpace

        @JsValue("pre")
        val pre: WhiteSpace

        @JsValue("pre-line")
        val preLine: WhiteSpace

        @JsValue("pre-wrap")
        val preWrap: WhiteSpace
    }
}
