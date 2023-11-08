// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.crypto

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface KeyType {
    companion object {
        @JsValue("private")
        val private: KeyType

        @JsValue("public")
        val public: KeyType

        @JsValue("secret")
        val secret: KeyType
    }
}
