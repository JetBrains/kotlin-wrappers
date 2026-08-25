// Automatically generated - do not modify!

package node.crypto

@js.union.JsUnion
sealed external interface GenerateKeyType

inline val GenerateKeyType.Companion.hmac: GenerateKeyType
    get() = js.reflect.unsafeCast("hmac")

inline val GenerateKeyType.Companion.aes: GenerateKeyType
    get() = js.reflect.unsafeCast("aes")
