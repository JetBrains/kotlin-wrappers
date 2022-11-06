// Automatically generated - do not modify!

package web.csp

import web.events.Event
import web.events.EventInit

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

open external class SecurityPolicyViolationEvent(
    type: String,
    init: SecurityPolicyViolationEventInit = definedExternally,
) : Event {
    val blockedURI: String
    val columnNumber: Int
    val disposition: SecurityPolicyViolationEventDisposition
    val documentURI: String
    val effectiveDirective: String
    val lineNumber: Int
    val originalPolicy: String
    val referrer: String
    val sample: String
    val sourceFile: String
    val statusCode: Int
    val violatedDirective: String

    companion object
}
