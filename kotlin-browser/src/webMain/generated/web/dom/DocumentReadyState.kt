// Automatically generated - do not modify!

package web.dom

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DocumentReadyState

inline val DocumentReadyState.Companion.complete: DocumentReadyState
    get() = unsafeCast("complete")

inline val DocumentReadyState.Companion.interactive: DocumentReadyState
    get() = unsafeCast("interactive")

inline val DocumentReadyState.Companion.loading: DocumentReadyState
    get() = unsafeCast("loading")
