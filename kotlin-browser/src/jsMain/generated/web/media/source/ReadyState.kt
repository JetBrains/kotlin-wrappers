// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.source

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface ReadyState {
    companion object {
        @JsValue("closed")
        val closed: ReadyState

        @JsValue("ended")
        val ended: ReadyState

        @JsValue("open")
        val open: ReadyState
    }
}
