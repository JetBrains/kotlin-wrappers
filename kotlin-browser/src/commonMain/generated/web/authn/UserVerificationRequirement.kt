// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.authn

import seskar.js.JsValue

sealed external interface UserVerificationRequirement {
    companion object {
        @JsValue("discouraged")
        val discouraged: UserVerificationRequirement

        @JsValue("preferred")
        val preferred: UserVerificationRequirement

        @JsValue("required")
        val required: UserVerificationRequirement
    }
}
