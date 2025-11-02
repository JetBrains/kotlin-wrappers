// Automatically generated - do not modify!

package web.performance

import kotlin.js.definedExternally

/**
 * The **`PerformanceObserverEntryList`** interface is a list of performance events that were explicitly observed via the observe() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList)
 */
open external class PerformanceObserverEntryList
private constructor() {
    /**
     * The **`getEntries()`** method of the PerformanceObserverEntryList interface returns a list of explicitly observed performance entry objects. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntries)
     */
    fun getEntries(): PerformanceEntryList

    /**
     * The **`getEntriesByName()`** method of the PerformanceObserverEntryList interface returns a list of explicitly observed PerformanceEntry objects for a given name and entryType. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByName)
     */
    fun getEntriesByName(
        name: String,
        type: String = definedExternally,
    ): PerformanceEntryList

    /**
     * The **`getEntriesByType()`** method of the PerformanceObserverEntryList returns a list of explicitly observed performance entry objects for a given performance entry type. The list's members are determined by the set of entry types specified in the call to the observe() method. The list is available in the observer's callback function (as the first parameter in the callback).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceObserverEntryList/getEntriesByType)
     */
    fun getEntriesByType(type: String): PerformanceEntryList
}
