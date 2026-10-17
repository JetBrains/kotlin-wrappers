// Automatically generated - do not modify!

package web.csp

import kotlinx.js.JsPlainObject
import web.events.EventInit

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#options)
 */
@JsPlainObject
external interface SecurityPolicyViolationEventInit :
    EventInit {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#blockedURI)
     */
    var blockedURI: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#columnNumber)
     */
    var columnNumber: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#disposition)
     */
    var disposition: SecurityPolicyViolationEventDisposition?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#documentURI)
     */
    var documentURI: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#effectiveDirective)
     */
    var effectiveDirective: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#lineNumber)
     */
    var lineNumber: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#originalPolicy)
     */
    var originalPolicy: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#referrer)
     */
    var referrer: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#sample)
     */
    var sample: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#sourceFile)
     */
    var sourceFile: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#statusCode)
     */
    var statusCode: Short?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SecurityPolicyViolationEvent/SecurityPolicyViolationEvent#violatedDirective)
     */
    var violatedDirective: String?
}
