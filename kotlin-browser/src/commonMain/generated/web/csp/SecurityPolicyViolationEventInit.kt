// Automatically generated - do not modify!

package web.csp

import js.objects.JsPlainObject
import web.events.EventInit

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
