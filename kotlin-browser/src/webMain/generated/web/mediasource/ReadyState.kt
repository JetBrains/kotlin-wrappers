// Automatically generated - do not modify!

package web.mediasource

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState)
 */
@JsUnion
sealed /* union */
external interface ReadyState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState#closed)
 */
inline val ReadyState.Companion.closed: ReadyState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState#ended)
 */
inline val ReadyState.Companion.ended: ReadyState
    get() = unsafeCast("ended")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventSource/readyState#open)
 */
inline val ReadyState.Companion.open: ReadyState
    get() = unsafeCast("open")
