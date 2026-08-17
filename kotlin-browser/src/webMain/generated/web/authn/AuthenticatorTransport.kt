// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AuthenticatorTransport

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
