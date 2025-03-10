// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
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
