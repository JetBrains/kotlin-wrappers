// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface AnimationPlayState {
    companion object {
        @JsValue("paused")
        val paused: AnimationPlayState

        @JsValue("running")
        val running: AnimationPlayState
    }
}
