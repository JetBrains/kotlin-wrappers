// Automatically generated - do not modify!

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
