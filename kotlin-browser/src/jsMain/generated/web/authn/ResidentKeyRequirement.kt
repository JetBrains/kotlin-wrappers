// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.authn

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
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
