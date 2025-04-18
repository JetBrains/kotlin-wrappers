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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/disconnect)
     */
    fun disconnect()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/observe)
     */
    fun observe(options: PerformanceObserverInit = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/takeRecords)
     */
    fun takeRecords(): PerformanceEntryList

    companion object {
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/supportedEntryTypes_static)
         */
        val supportedEntryTypes: ReadonlyArray<JsString>
    }
}
