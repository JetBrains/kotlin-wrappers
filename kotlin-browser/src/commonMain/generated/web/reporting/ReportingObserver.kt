// Automatically generated - do not modify!

package web.reporting

import kotlin.js.definedExternally

/**
 * The `ReportingObserver` interface of the Reporting API allows you to collect and access reports.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver)
 */
open external class ReportingObserver(
    callback: ReportingObserverCallback,
    options: ReportingObserverOptions = definedExternally,
) {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/disconnect)
     */
    fun disconnect()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/observe)
     */
    fun observe()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/takeRecords)
     */
    fun takeRecords(): ReportList
}
