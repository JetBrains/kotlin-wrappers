// Automatically generated - do not modify!

package node.crypto

sealed external interface ECDHConvertKeyFormat {
    companion object
}

inline val ECDHConvertKeyFormat.Companion.uncompressed: ECDHConvertKeyFormat
    get() = js.reflect.unsafeCast("uncompressed")

inline val ECDHConvertKeyFormat.Companion.compressed: ECDHConvertKeyFormat
    get() = js.reflect.unsafeCast("compressed")

inline val ECDHConvertKeyFormat.Companion.hybrid: ECDHConvertKeyFormat
    get() = js.reflect.unsafeCast("hybrid")
