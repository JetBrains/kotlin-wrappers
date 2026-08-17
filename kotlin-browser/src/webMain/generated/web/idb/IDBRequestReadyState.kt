// Automatically generated - do not modify!

package web.idb

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface IDBRequestReadyState

inline val IDBRequestReadyState.Companion.done: IDBRequestReadyState
    get() = unsafeCast("done")

inline val IDBRequestReadyState.Companion.pending: IDBRequestReadyState
    get() = unsafeCast("pending")
