// Automatically generated - do not modify!

package web.csp

import seskar.js.JsValue
import web.events.EventTarget
import web.events.EventType

sealed external class SecurityPolicyViolationEventTypes {

    @JsValue("securitypolicyviolation")
    fun <C : EventTarget> securityPolicyViolation(): EventType<SecurityPolicyViolationEvent, C>
}
