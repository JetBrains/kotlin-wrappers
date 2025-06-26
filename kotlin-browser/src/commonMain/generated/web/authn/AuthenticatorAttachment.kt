// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import js.reflect.unsafeCast

sealed external interface AuthenticatorAttachment {
    companion object
}

inline val AuthenticatorAttachment.Companion.crossPlatform: AuthenticatorAttachment
    get() = unsafeCast("crossPlatform")

inline val AuthenticatorAttachment.Companion.platform: AuthenticatorAttachment
    get() = unsafeCast("platform")
