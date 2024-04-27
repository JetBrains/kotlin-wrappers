// Automatically generated - do not modify!

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
