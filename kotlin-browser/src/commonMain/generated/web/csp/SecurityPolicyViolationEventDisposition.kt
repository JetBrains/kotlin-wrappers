// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.csp

import seskar.js.JsValue

sealed external interface SecurityPolicyViolationEventDisposition {
    companion object {
        @JsValue("enforce")
        val enforce: SecurityPolicyViolationEventDisposition

        @JsValue("report")
        val report: SecurityPolicyViolationEventDisposition
    }
}
