// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.animations

import seskar.js.JsValue

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
