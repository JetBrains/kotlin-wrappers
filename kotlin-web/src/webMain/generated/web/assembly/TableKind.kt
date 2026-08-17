// Automatically generated - do not modify!

package web.assembly

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface TableKind

inline val TableKind.Companion.anyfunc: TableKind
    get() = unsafeCast("anyfunc")

inline val TableKind.Companion.externref: TableKind
    get() = unsafeCast("externref")
