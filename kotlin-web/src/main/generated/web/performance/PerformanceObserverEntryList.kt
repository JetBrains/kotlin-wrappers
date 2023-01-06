// Automatically generated - do not modify!

package web.performance

sealed external class PerformanceObserverEntryList {
    fun getEntries(): PerformanceEntryList
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    fun getEntriesByType(type: String): PerformanceEntryList
}
