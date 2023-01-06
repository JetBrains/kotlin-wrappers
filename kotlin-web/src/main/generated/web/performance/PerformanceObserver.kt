// Automatically generated - do not modify!

package web.performance

import js.core.ReadonlyArray

external class PerformanceObserver(
    callback: PerformanceObserverCallback,
) {
    fun disconnect()
    fun observe(options: PerformanceObserverInit = definedExternally)
    fun takeRecords(): PerformanceEntryList

    companion object {
        val supportedEntryTypes: ReadonlyArray<String>
    }
}
