// Automatically generated - do not modify!

package web.csp

import js.objects.JsPlainObject
import web.events.EventInit

@JsPlainObject
external interface SecurityPolicyViolationEventInit :
    EventInit {
    val blockedURI: String?
    val columnNumber: UInt?
    val disposition: SecurityPolicyViolationEventDisposition?
    val documentURI: String?
    val effectiveDirective: String?
    val lineNumber: UInt?
    val originalPolicy: String?
    val referrer: String?
    val sample: String?
    val sourceFile: String?
    val statusCode: UShort?
    val violatedDirective: String?
}
