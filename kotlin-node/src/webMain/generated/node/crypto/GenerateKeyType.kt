// Automatically generated - do not modify!

package node.crypto

sealed external interface GenerateKeyType {
    companion object {
        @seskar.js.JsValue("hmac")
        val hmac: GenerateKeyType

        @seskar.js.JsValue("aes")
        val aes: GenerateKeyType
    }
}
