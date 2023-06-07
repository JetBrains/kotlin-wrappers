// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

// language=JavaScript
@JsName("""(/*union*/{ble: 'ble', hybrid: 'hybrid', internal: 'internal', nfc: 'nfc', usb: 'usb'}/*union*/)""")
sealed external interface AuthenticatorTransport {
    companion object {
        val ble: AuthenticatorTransport
        val hybrid: AuthenticatorTransport
        val internal: AuthenticatorTransport
        val nfc: AuthenticatorTransport
        val usb: AuthenticatorTransport
    }
}
