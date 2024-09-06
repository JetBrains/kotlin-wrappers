// Automatically generated - do not modify!

package web.csp

import seskar.js.JsValue
import web.events.EventType

sealed external class SecurityPolicyViolationEventTypes_deprecated {

    @Deprecated(
        message = "Legacy event type declaration. Use type constant instead!",
        replaceWith = ReplaceWith("SecurityPolicyViolationEvent.SECURITY_POLICY_VIOLATION"),
    )
    @JsValue("securitypolicyviolation")
    fun securityPolicyViolation(): EventType<SecurityPolicyViolationEvent>
}
