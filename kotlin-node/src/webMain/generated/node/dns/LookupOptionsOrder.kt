// Automatically generated - do not modify!

package node.dns

sealed external interface LookupOptionsOrder {
    companion object
}

inline val LookupOptionsOrder.Companion.ipv4first: LookupOptionsOrder
    get() = js.reflect.unsafeCast("ipv4first")

inline val LookupOptionsOrder.Companion.ipv6first: LookupOptionsOrder
    get() = js.reflect.unsafeCast("ipv6first")

inline val LookupOptionsOrder.Companion.verbatim: LookupOptionsOrder
    get() = js.reflect.unsafeCast("verbatim")
