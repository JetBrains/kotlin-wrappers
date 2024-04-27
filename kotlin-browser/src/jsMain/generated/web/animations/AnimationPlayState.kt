// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AnimationPlayState {
    companion object {
        @JsValue("finished")
        val finished: AnimationPlayState

        @JsValue("idle")
        val idle: AnimationPlayState

        @JsValue("paused")
        val paused: AnimationPlayState

        @JsValue("running")
        val running: AnimationPlayState
    }
}
