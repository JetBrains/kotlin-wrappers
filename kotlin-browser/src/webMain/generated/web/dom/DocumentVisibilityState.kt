// Automatically generated - do not modify!

package web.dom

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DocumentVisibilityState

inline val DocumentVisibilityState.Companion.hidden: DocumentVisibilityState
    get() = unsafeCast("hidden")

inline val DocumentVisibilityState.Companion.visible: DocumentVisibilityState
    get() = unsafeCast("visible")
