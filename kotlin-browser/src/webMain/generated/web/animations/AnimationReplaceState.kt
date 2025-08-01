// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import js.reflect.unsafeCast

sealed external interface AnimationReplaceState {
    companion object
}

inline val AnimationReplaceState.Companion.active: AnimationReplaceState
    get() = unsafeCast("active")

inline val AnimationReplaceState.Companion.persisted: AnimationReplaceState
    get() = unsafeCast("persisted")

inline val AnimationReplaceState.Companion.removed: AnimationReplaceState
    get() = unsafeCast("removed")
