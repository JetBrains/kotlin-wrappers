// Automatically generated - do not modify!

package web.animations

import seskar.js.JsValue

sealed external interface AnimationReplaceState {
    companion object {
        @JsValue("active")
        val active: AnimationReplaceState

        @JsValue("persisted")
        val persisted: AnimationReplaceState

        @JsValue("removed")
        val removed: AnimationReplaceState
    }
}
