// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.authn

import seskar.js.JsValue

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
