// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.assembly

import js.reflect.unsafeCast

sealed external interface TableKind {
    companion object
}

inline val TableKind.Companion.anyfunc: TableKind
    get() = unsafeCast("anyfunc")

inline val TableKind.Companion.externref: TableKind
    get() = unsafeCast("externref")
