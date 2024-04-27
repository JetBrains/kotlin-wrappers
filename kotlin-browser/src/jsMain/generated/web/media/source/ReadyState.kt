// Automatically generated - do not modify!

package web.media.source

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
