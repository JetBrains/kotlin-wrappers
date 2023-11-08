// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
