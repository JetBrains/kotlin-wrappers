// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.csp

import seskar.js.JsValue
import web.events.EventType

sealed external interface SecurityPolicyViolationEventTypes {
    @JsValue("securitypolicyviolation")
    val SECURITY_POLICY_VIOLATION: EventType<SecurityPolicyViolationEvent<*>>
        get() = definedExternally
}
