// Automatically generated - do not modify!

package web.mediasource

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ReadyState

inline val ReadyState.Companion.closed: ReadyState
    get() = unsafeCast("closed")

inline val ReadyState.Companion.ended: ReadyState
    get() = unsafeCast("ended")

inline val ReadyState.Companion.open: ReadyState
    get() = unsafeCast("open")
