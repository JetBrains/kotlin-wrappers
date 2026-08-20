// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState)
 */
@JsUnion
sealed /* union */
external interface AnimationReplaceState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState#active)
 */
inline val AnimationReplaceState.Companion.active: AnimationReplaceState
    get() = unsafeCast("active")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState#persisted)
 */
inline val AnimationReplaceState.Companion.persisted: AnimationReplaceState
    get() = unsafeCast("persisted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Animation/replaceState#removed)
 */
inline val AnimationReplaceState.Companion.removed: AnimationReplaceState
    get() = unsafeCast("removed")
