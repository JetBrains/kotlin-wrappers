// Automatically generated - do not modify!

package node.crypto

sealed external interface GenerateKeyType {
    companion object
}

inline val GenerateKeyType.Companion.hmac: GenerateKeyType
    get() = js.reflect.unsafeCast("hmac")

inline val GenerateKeyType.Companion.aes: GenerateKeyType
    get() = js.reflect.unsafeCast("aes")
