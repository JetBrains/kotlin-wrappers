// Automatically generated - do not modify!

package web.reporting

import js.core.JsAny

/**
 * The `Report` interface of the Reporting API represents a single report.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report)
 */
external class Report
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/body)
     */
    val body: ReportBody?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/type)
     */
    val type: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Report/url)
     */
    val url: String
    fun toJSON(): JsAny
}
