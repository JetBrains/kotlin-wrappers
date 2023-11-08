// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AuthenticatorTransport {
    companion object {
        @JsValue("ble")
        val ble: AuthenticatorTransport

        @JsValue("hybrid")
        val hybrid: AuthenticatorTransport

        @JsValue("internal")
        val internal: AuthenticatorTransport

        @JsValue("nfc")
        val nfc: AuthenticatorTransport

        @JsValue("usb")
        val usb: AuthenticatorTransport
    }
}
