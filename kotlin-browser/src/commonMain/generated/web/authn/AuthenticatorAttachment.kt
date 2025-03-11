// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import seskar.js.JsValue

sealed external interface AuthenticatorAttachment {
    companion object {
        @JsValue("cross-platform")
        val crossPlatform: AuthenticatorAttachment

        @JsValue("platform")
        val platform: AuthenticatorAttachment
    }
}
