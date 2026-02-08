// Automatically generated - do not modify!

package node.net

sealed external interface IPVersion {
    companion object
}

inline val IPVersion.Companion.ipv4: IPVersion
    get() = js.reflect.unsafeCast("ipv4")

inline val IPVersion.Companion.ipv6: IPVersion
    get() = js.reflect.unsafeCast("ipv6")
