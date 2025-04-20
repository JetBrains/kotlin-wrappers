// Automatically generated - do not modify!

package web.reporting

import js.core.JsAny
import web.csp.SecurityPolicyViolationEventDisposition

/**
 * The `CSPViolationReportBody` interface is an extension of the Reporting API that represents the body of a Content Security Policy (CSP) violation report.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody)
 */
external class CSPViolationReportBody
private constructor() :
    ReportBody {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/blockedURL)
     */
    val blockedURL: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/columnNumber)
     */
    val columnNumber: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/disposition)
     */
    val disposition: SecurityPolicyViolationEventDisposition

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/documentURL)
     */
    val documentURL: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/effectiveDirective)
     */
    val effectiveDirective: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/lineNumber)
     */
    val lineNumber: Int?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/originalPolicy)
     */
    val originalPolicy: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/referrer)
     */
    val referrer: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/sample)
     */
    val sample: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/sourceFile)
     */
    val sourceFile: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/statusCode)
     */
    val statusCode: Short

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSPViolationReportBody/toJSON)
     */
    override fun toJSON(): JsAny
}
