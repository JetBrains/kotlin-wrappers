// Automatically generated - do not modify!

package node.crypto

sealed external interface PrivateKeyInputType {
    companion object {
        @seskar.js.JsValue("pkcs1")
        val pkcs1: PrivateKeyInputType

        @seskar.js.JsValue("pkcs8")
        val pkcs8: PrivateKeyInputType

        @seskar.js.JsValue("sec1")
        val sec1: PrivateKeyInputType
    }
}
