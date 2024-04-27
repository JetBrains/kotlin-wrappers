// Automatically generated - do not modify!

package web.authn

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
