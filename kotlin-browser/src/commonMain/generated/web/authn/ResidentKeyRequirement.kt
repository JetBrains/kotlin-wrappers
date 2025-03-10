// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.authn

import seskar.js.JsValue

sealed external interface ResidentKeyRequirement {
    companion object {
        @JsValue("discouraged")
        val discouraged: ResidentKeyRequirement

        @JsValue("preferred")
        val preferred: ResidentKeyRequirement

        @JsValue("required")
        val required: ResidentKeyRequirement
    }
}
