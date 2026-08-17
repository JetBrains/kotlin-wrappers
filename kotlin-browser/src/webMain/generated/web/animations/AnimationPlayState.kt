// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AnimationPlayState

inline val AnimationPlayState.Companion.finished: AnimationPlayState
    get() = unsafeCast("finished")

inline val AnimationPlayState.Companion.idle: AnimationPlayState
    get() = unsafeCast("idle")

inline val AnimationPlayState.Companion.paused: AnimationPlayState
    get() = unsafeCast("paused")

inline val AnimationPlayState.Companion.running: AnimationPlayState
    get() = unsafeCast("running")
