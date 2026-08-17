// Automatically generated - do not modify!

package web.dom

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface InsertPosition

inline val InsertPosition.Companion.afterbegin: InsertPosition
    get() = unsafeCast("afterbegin")

inline val InsertPosition.Companion.afterend: InsertPosition
    get() = unsafeCast("afterend")

inline val InsertPosition.Companion.beforebegin: InsertPosition
    get() = unsafeCast("beforebegin")

inline val InsertPosition.Companion.beforeend: InsertPosition
    get() = unsafeCast("beforeend")
