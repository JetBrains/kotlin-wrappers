// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.animations

import js.reflect.unsafeCast

sealed external interface AnimationPlayState {
    companion object
}

inline val AnimationPlayState.Companion.finished: AnimationPlayState
    get() = unsafeCast("finished")

inline val AnimationPlayState.Companion.idle: AnimationPlayState
    get() = unsafeCast("idle")

inline val AnimationPlayState.Companion.paused: AnimationPlayState
    get() = unsafeCast("paused")

inline val AnimationPlayState.Companion.running: AnimationPlayState
    get() = unsafeCast("running")
