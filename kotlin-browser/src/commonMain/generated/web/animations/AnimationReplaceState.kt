// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

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
