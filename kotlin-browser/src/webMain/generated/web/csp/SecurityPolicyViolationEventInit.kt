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
    var blockedURI: String?
    var columnNumber: Int?
    var disposition: SecurityPolicyViolationEventDisposition?
    var documentURI: String?
    var effectiveDirective: String?
    var lineNumber: Int?
    var originalPolicy: String?
    var referrer: String?
    var sample: String?
    var sourceFile: String?
    var statusCode: Short?
    var violatedDirective: String?
}
