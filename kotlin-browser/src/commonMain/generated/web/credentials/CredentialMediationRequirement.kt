// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.credentials

import seskar.js.JsValue

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
