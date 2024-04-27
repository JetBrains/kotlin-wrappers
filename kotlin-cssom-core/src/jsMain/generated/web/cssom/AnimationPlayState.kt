// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AnimationPlayState {
    companion object {
        @JsValue("paused")
        val paused: AnimationPlayState

        @JsValue("running")
        val running: AnimationPlayState
    }
}
