// Automatically generated - do not modify!

package web.performance

/**
 * The legacy PerformanceNavigation interface represents information about how the navigation to the current document was done.
 * @deprecated This interface is deprecated in the Navigation Timing Level 2 specification. Please use the PerformanceNavigationTiming interface instead.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceNavigation)
 */
sealed external class PerformanceNavigation {
    val TYPE_NAVIGATE: Short
    val TYPE_RELOAD: Short
    val TYPE_BACK_FORWARD: Short
    val TYPE_RESERVED: Short

    companion object {
        val TYPE_NAVIGATE: Short
        val TYPE_RELOAD: Short
        val TYPE_BACK_FORWARD: Short
        val TYPE_RESERVED: Short
    }
}
