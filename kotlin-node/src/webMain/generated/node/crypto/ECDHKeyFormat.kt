// Automatically generated - do not modify!

package node.crypto

sealed external interface ECDHKeyFormat {
    companion object
}

inline val ECDHKeyFormat.Companion.compressed: ECDHKeyFormat
    get() = js.reflect.unsafeCast("compressed")

inline val ECDHKeyFormat.Companion.uncompressed: ECDHKeyFormat
    get() = js.reflect.unsafeCast("uncompressed")

inline val ECDHKeyFormat.Companion.hybrid: ECDHKeyFormat
    get() = js.reflect.unsafeCast("hybrid")
