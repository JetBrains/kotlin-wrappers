// Automatically generated - do not modify!

package node.crypto

@js.union.JsUnion
sealed external interface KeyObjectType

inline val KeyObjectType.Companion.secret: KeyObjectType
    get() = js.reflect.unsafeCast("secret")

inline val KeyObjectType.Companion.public: KeyObjectType
    get() = js.reflect.unsafeCast("public")

inline val KeyObjectType.Companion.private: KeyObjectType
    get() = js.reflect.unsafeCast("private")
