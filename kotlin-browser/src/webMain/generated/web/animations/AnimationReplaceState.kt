// Automatically generated - do not modify!

package web.animations

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AnimationReplaceState

inline val AnimationReplaceState.Companion.active: AnimationReplaceState
    get() = unsafeCast("active")

inline val AnimationReplaceState.Companion.persisted: AnimationReplaceState
    get() = unsafeCast("persisted")

inline val AnimationReplaceState.Companion.removed: AnimationReplaceState
    get() = unsafeCast("removed")
