// Automatically generated - do not modify!

package web.authn

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AuthenticatorAttachment

inline val AuthenticatorAttachment.Companion.crossPlatform: AuthenticatorAttachment
    get() = unsafeCast("cross-platform")

inline val AuthenticatorAttachment.Companion.platform: AuthenticatorAttachment
    get() = unsafeCast("platform")
