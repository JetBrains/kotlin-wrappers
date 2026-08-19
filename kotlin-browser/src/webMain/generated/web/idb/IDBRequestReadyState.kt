// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState)
 */
@JsUnion
sealed /* union */
external interface IDBRequestReadyState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState#done)
 */
inline val IDBRequestReadyState.Companion.done: IDBRequestReadyState
    get() = unsafeCast("done")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/IDBRequest/readyState#pending)
 */
inline val IDBRequestReadyState.Companion.pending: IDBRequestReadyState
    get() = unsafeCast("pending")
