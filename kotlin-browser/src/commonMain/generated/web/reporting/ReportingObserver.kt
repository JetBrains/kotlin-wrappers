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
     * The **`disconnect()`** method of the ReportingObserver interface stops a reporting observer that had previously started observing from collecting reports.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/disconnect)
     */
    fun disconnect()

    /**
     * The **`observe()`** method of the ReportingObserver interface instructs a reporting observer to start collecting reports in its report queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/observe)
     */
    fun observe()

    /**
     * The **`takeRecords()`** method of the ReportingObserver interface returns the current list of reports contained in the observer's report queue, and empties the queue.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReportingObserver/takeRecords)
     */
    fun takeRecords(): ReportList
}
