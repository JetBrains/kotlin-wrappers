// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.serviceworker

import seskar.js.JsValue

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
