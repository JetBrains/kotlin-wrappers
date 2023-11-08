// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
