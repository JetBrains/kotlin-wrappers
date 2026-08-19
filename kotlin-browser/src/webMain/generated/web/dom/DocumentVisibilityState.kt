// Automatically generated - do not modify!

package web.dom

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState)
 */
@JsUnion
sealed /* union */
external interface DocumentVisibilityState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState#hidden)
 */
inline val DocumentVisibilityState.Companion.hidden: DocumentVisibilityState
    get() = unsafeCast("hidden")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/visibilityState#visible)
 */
inline val DocumentVisibilityState.Companion.visible: DocumentVisibilityState
    get() = unsafeCast("visible")
