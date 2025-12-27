// Automatically generated - do not modify!

package node.crypto

sealed external interface KeyFormat {
    sealed interface mlDsa : KeyFormat

    sealed interface mlKem : KeyFormat

    sealed interface slhDsa : KeyFormat

    sealed interface pem : KeyFormat

    sealed interface der : KeyFormat

    sealed interface jwk : KeyFormat

    companion object {
        @seskar.js.JsValue("pem")
        val pem: pem

        @seskar.js.JsValue("der")
        val der: der

        @seskar.js.JsValue("jwk")
        val jwk: jwk
    }
}
