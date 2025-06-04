// Automatically generated - do not modify!

package web.performance

import js.array.ReadonlyArray
import js.core.JsString
import kotlin.js.definedExternally

/**
 * The **`PerformanceObserver`** interface is used to observe performance measurement events and be notified of new PerformanceEntry as they are recorded in the browser's _performance timeline_.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver)
 */
open external class PerformanceObserver(
    callback: PerformanceObserverCallback,
) {
    /**
     * The **`disconnect()`** method of the PerformanceObserver interface is used to stop the performance observer from receiving any PerformanceEntry events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/disconnect)
     */
    fun disconnect()

    /**
     * The **`observe()`** method of the **PerformanceObserver** interface is used to specify the set of performance entry types to observe.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/observe)
     */
    fun observe(options: PerformanceObserverInit = definedExternally)

    /**
     * The **`takeRecords()`** method of the PerformanceObserver interface returns the current list of PerformanceEntry objects stored in the performance observer, emptying it out.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/takeRecords)
     */
    fun takeRecords(): PerformanceEntryList

    companion object {
        /**
         * The static **`supportedEntryTypes`** read-only property of the PerformanceObserver interface returns an array of the PerformanceEntry.entryType values supported by the user agent.
         *
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/supportedEntryTypes_static)
         */
        val supportedEntryTypes: ReadonlyArray<JsString>
    }
}
