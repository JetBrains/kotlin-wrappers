// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState)
 */
@JsUnion
sealed /* union */
external interface AnimationPlayState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState#finished)
 */
inline val AnimationPlayState.Companion.finished: AnimationPlayState
    get() = unsafeCast("finished")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState#idle)
 */
inline val AnimationPlayState.Companion.idle: AnimationPlayState
    get() = unsafeCast("idle")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState#paused)
 */
inline val AnimationPlayState.Companion.paused: AnimationPlayState
    get() = unsafeCast("paused")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/playState#running)
 */
inline val AnimationPlayState.Companion.running: AnimationPlayState
    get() = unsafeCast("running")
