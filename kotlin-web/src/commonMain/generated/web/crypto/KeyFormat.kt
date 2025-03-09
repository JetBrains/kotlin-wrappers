// Automatically generated - do not modify!

package web.crypto

import seskar.js.JsValue

sealed external interface KeyFormat {
    companion object {
        @JsValue("jwk")
        val jwk: jwk

        @JsValue("pkcs8")
        val pkcs8: pkcs8

        @JsValue("raw")
        val raw: raw

        @JsValue("spki")
        val spki: spki
    }

    sealed interface jwk : KeyFormat
    sealed interface pkcs8 : KeyFormat
    sealed interface raw : KeyFormat
    sealed interface spki : KeyFormat
}
