// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import js.reflect.unsafeCast

sealed external interface AuthenticatorTransport {
    companion object
}

inline val AuthenticatorTransport.Companion.ble: AuthenticatorTransport
    get() = unsafeCast("ble")

inline val AuthenticatorTransport.Companion.hybrid: AuthenticatorTransport
    get() = unsafeCast("hybrid")

inline val AuthenticatorTransport.Companion.internal: AuthenticatorTransport
    get() = unsafeCast("internal")

inline val AuthenticatorTransport.Companion.nfc: AuthenticatorTransport
    get() = unsafeCast("nfc")

inline val AuthenticatorTransport.Companion.usb: AuthenticatorTransport
    get() = unsafeCast("usb")
