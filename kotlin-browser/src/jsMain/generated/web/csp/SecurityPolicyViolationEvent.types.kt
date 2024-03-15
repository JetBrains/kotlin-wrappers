// Automatically generated - do not modify!

package web.csp

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.events.EventTarget
import web.events.EventType

@JsVirtual
sealed external class SecurityPolicyViolationEventTypes {

    @JsValue("securitypolicyviolation")
    fun <C : EventTarget> securityPolicyViolation(): EventType<SecurityPolicyViolationEvent, C>
}
