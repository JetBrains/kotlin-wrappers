// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface PublicKeyCredentialType {
    companion object {
        @JsValue("public-key")
        val publicKey: PublicKeyCredentialType
    }
}
