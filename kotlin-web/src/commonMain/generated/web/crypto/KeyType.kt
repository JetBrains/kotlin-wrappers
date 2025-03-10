// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.crypto

import seskar.js.JsValue

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
