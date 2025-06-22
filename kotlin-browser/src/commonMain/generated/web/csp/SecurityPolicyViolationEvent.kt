// Automatically generated - do not modify!

package web.csp

import js.reflect.unsafeCast
import seskar.js.JsValue
import web.events.Event
import web.events.EventType
import kotlin.js.definedExternally

/**
 * The **`SecurityPolicyViolationEvent`** interface inherits from Event, and represents the event object of a `securitypolicyviolation` event sent on an Element/securitypolicyviolation_event, Document/securitypolicyviolation_event, or WorkerGlobalScope/securitypolicyviolation_event when its Content Security Policy (CSP) is violated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent)
 */
open external class SecurityPolicyViolationEvent(
    override val type: EventType<SecurityPolicyViolationEvent>,
    init: SecurityPolicyViolationEventInit = definedExternally,
) : Event {
    /**
     * The **`blockedURI`** read-only property of the SecurityPolicyViolationEvent interface is a string representing the URI of the resource that was blocked because it violates a Content Security Policy (CSP).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/blockedURI)
     */
    val blockedURI: String

    /**
     * The **`columnNumber`** read-only property of the SecurityPolicyViolationEvent interface is the column number in the document or worker script at which the Content Security Policy (CSP) violation occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/columnNumber)
     */
    val columnNumber: Int

    /**
     * The **`disposition`** read-only property of the SecurityPolicyViolationEvent interface indicates how the violated Content Security Policy (CSP) is configured to be treated by the user agent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition)
     */
    val disposition: SecurityPolicyViolationEventDisposition

    /**
     * The **`documentURI`** read-only property of the SecurityPolicyViolationEvent interface is a string representing the URI of the document or worker in which the Content Security Policy (CSP) violation occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/documentURI)
     */
    val documentURI: String

    /**
     * The **`effectiveDirective`** read-only property of the SecurityPolicyViolationEvent interface is a string representing the Content Security Policy (CSP) directive that was violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/effectiveDirective)
     */
    val effectiveDirective: String

    /**
     * The **`lineNumber`** read-only property of the SecurityPolicyViolationEvent interface is the line number in the document or worker script at which the Content Security Policy (CSP) violation occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/lineNumber)
     */
    val lineNumber: Int

    /**
     * The **`originalPolicy`** read-only property of the SecurityPolicyViolationEvent interface is a string containing the Content Security Policy (CSP) whose enforcement uncovered the violation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/originalPolicy)
     */
    val originalPolicy: String

    /**
     * The **`referrer`** read-only property of the SecurityPolicyViolationEvent interface is a string representing the referrer for the resources whose Content Security Policy (CSP) was violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/referrer)
     */
    val referrer: String

    /**
     * The **`sample`** read-only property of the SecurityPolicyViolationEvent interface is a string representing a sample of the resource that caused the Content Security Policy (CSP) violation.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sample)
     */
    val sample: String

    /**
     * The **`sourceFile`** read-only property of the SecurityPolicyViolationEvent interface is a string representing the URL of the script in which the Content Security Policy (CSP) violation occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sourceFile)
     */
    val sourceFile: String

    /**
     * The **`statusCode`** read-only property of the SecurityPolicyViolationEvent interface is a number representing the HTTP status code of the window or worker in which the Content Security Policy (CSP) violation occurred.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/statusCode)
     */
    val statusCode: Short

    /**
     * The **`violatedDirective`** read-only property of the SecurityPolicyViolationEvent interface is a string representing the Content Security Policy (CSP) directive that was violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/violatedDirective)
     */
    val violatedDirective: String

    companion object {
        @JsValue("securitypolicyviolation")
        val SECURITY_POLICY_VIOLATION: EventType<SecurityPolicyViolationEvent>
    }
}

inline fun SecurityPolicyViolationEvent.asInit(): SecurityPolicyViolationEventInit =
    unsafeCast(this)
