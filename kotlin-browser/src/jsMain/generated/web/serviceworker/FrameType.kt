// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.serviceworker

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FrameType {
    companion object {
        @JsValue("auxiliary")
        val auxiliary: FrameType

        @JsValue("nested")
        val nested: FrameType

        @JsValue("none")
        val none: FrameType

        @JsValue("top-level")
        val topLevel: FrameType
    }
}
