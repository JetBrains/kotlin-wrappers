// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.csp

import web.events.Event
import web.events.EventTarget
import web.events.EventType

/**
 * Inherits from Event, and represents the event object of an event sent on a document or worker when its content security policy is violated.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent)
 */
open external class SecurityPolicyViolationEvent<out C : EventTarget?>(
    override val type: EventType<SecurityPolicyViolationEvent<*>>,
    init: SecurityPolicyViolationEventInit = definedExternally,
) : Event<C>,
    SecurityPolicyViolationEventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/blockedURI)
     */
    override val blockedURI: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/columnNumber)
     */
    override val columnNumber: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/disposition)
     */
    override val disposition: SecurityPolicyViolationEventDisposition

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/documentURI)
     */
    override val documentURI: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/effectiveDirective)
     */
    override val effectiveDirective: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/lineNumber)
     */
    override val lineNumber: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/originalPolicy)
     */
    override val originalPolicy: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/referrer)
     */
    override val referrer: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sample)
     */
    override val sample: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/sourceFile)
     */
    override val sourceFile: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/statusCode)
     */
    override val statusCode: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/violatedDirective)
     */
    override val violatedDirective: String

    companion object : SecurityPolicyViolationEventTypes
}
