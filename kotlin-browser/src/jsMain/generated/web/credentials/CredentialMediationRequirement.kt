// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.credentials

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface CredentialMediationRequirement {
    companion object {
        @JsValue("conditional")
        val conditional: CredentialMediationRequirement

        @JsValue("optional")
        val optional: CredentialMediationRequirement

        @JsValue("required")
        val required: CredentialMediationRequirement

        @JsValue("silent")
        val silent: CredentialMediationRequirement
    }
}
