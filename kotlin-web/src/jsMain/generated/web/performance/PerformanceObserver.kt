// Automatically generated - do not modify!

package web.performance

import js.core.ReadonlyArray

external class PerformanceObserver(
    callback: PerformanceObserverCallback,
) {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/disconnect) */
    fun disconnect()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/observe) */
    fun observe(options: PerformanceObserverInit = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/takeRecords) */
    fun takeRecords(): PerformanceEntryList

    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserver/supportedEntryTypes_static) */
        val supportedEntryTypes: ReadonlyArray<String>
    }
}
