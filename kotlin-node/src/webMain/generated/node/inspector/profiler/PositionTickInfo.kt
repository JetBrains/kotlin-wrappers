// Automatically generated - do not modify!

package node.inspector.profiler

/**
 * Specifies a number of samples attributed to a certain source position.
 */
sealed external interface PositionTickInfo {
    /**
     * Source line number (1-based).
     */
    var line: Double

    /**
     * Number of samples attributed to the source line.
     */
    var ticks: Double
}
