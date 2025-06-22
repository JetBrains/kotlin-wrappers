// Automatically generated - do not modify!

package web.reporting

import js.core.JsAny

/**
 * The `Report` interface of the Reporting API represents a single report.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report)
 */
// @JsPlainObject
external class Report
private constructor() {
    /**
     * The **`body`** read-only property of the Report interface returns the body of the report, which is a `ReportBody` object containing the detailed report information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/body)
     */
    val body: ReportBody?

    /**
     * The **`type`** read-only property of the Report interface returns the type of report generated, e.g., `deprecation` or `intervention`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/type)
     */
    val type: String

    /**
     * The **`url`** read-only property of the Report interface returns the URL of the document that generated the report.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/url)
     */
    val url: String
    fun toJSON(): JsAny
}
