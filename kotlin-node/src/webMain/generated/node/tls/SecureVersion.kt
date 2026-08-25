// Automatically generated - do not modify!

package node.tls

@js.union.JsUnion
sealed external interface SecureVersion

inline val SecureVersion.Companion.`TLSv1-3`: SecureVersion
    get() = js.reflect.unsafeCast("TLSv1.3")

inline val SecureVersion.Companion.`TLSv1-2`: SecureVersion
    get() = js.reflect.unsafeCast("TLSv1.2")

inline val SecureVersion.Companion.`TLSv1-1`: SecureVersion
    get() = js.reflect.unsafeCast("TLSv1.1")

inline val SecureVersion.Companion.TLSv1: SecureVersion
    get() = js.reflect.unsafeCast("TLSv1")
