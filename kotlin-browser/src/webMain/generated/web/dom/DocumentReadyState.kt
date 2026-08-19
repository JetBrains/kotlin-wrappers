// Automatically generated - do not modify!

package web.dom

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState)
 */
@JsUnion
sealed /* union */
external interface DocumentReadyState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState#complete)
 */
inline val DocumentReadyState.Companion.complete: DocumentReadyState
    get() = unsafeCast("complete")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState#interactive)
 */
inline val DocumentReadyState.Companion.interactive: DocumentReadyState
    get() = unsafeCast("interactive")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/readyState#loading)
 */
inline val DocumentReadyState.Companion.loading: DocumentReadyState
    get() = unsafeCast("loading")
