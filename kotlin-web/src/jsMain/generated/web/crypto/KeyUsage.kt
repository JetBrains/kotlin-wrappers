// Automatically generated - do not modify!

package web.crypto

import seskar.js.JsValue

sealed external interface KeyUsage {
    companion object {
        @JsValue("decrypt")
        val decrypt: KeyUsage

        @JsValue("deriveBits")
        val deriveBits: KeyUsage

        @JsValue("deriveKey")
        val deriveKey: KeyUsage

        @JsValue("encrypt")
        val encrypt: KeyUsage

        @JsValue("sign")
        val sign: KeyUsage

        @JsValue("unwrapKey")
        val unwrapKey: KeyUsage

        @JsValue("verify")
        val verify: KeyUsage

        @JsValue("wrapKey")
        val wrapKey: KeyUsage
    }
}
