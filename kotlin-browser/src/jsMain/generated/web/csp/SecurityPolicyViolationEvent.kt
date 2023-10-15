// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.csp

import web.events.Event
import web.events.EventInit
import web.events.EventType

external interface SecurityPolicyViolationEventInit : EventInit {
    var blockedURI: String?
    var columnNumber: Int?
    var disposition: SecurityPolicyViolationEventDisposition
    var documentURI: String
    var effectiveDirective: String
    var lineNumber: Int?
    var originalPolicy: String
    var referrer: String?
    var sample: String?
    var sourceFile: String?
    var statusCode: Int
    var violatedDirective: String
}

/**
 * Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent)
 */
open external class SecurityPolicyViolationEvent(
    override val type: EventType<SecurityPolicyViolationEvent>,
    init: SecurityPolicyViolationEventInit = definedExternally,
) : Event {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/blockedURI) */
    val blockedURI: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/columnNumber) */
    val columnNumber: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition) */
    val disposition: SecurityPolicyViolationEventDisposition

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/documentURI) */
    val documentURI: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/effectiveDirective) */
    val effectiveDirective: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/lineNumber) */
    val lineNumber: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/originalPolicy) */
    val originalPolicy: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/referrer) */
    val referrer: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sample) */
    val sample: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sourceFile) */
    val sourceFile: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/statusCode) */
    val statusCode: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/violatedDirective) */
    val violatedDirective: String

    companion object
}
