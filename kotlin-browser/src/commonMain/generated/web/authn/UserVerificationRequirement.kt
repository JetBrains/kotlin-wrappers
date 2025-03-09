// Automatically generated - do not modify!

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
