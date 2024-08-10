// Generated by Karakum - do not modify it manually!

package node.inspector.profiler

/**
 * Coverage data for a source range.
 */
sealed external interface CoverageRange {
    /**
     * JavaScript script source offset for the range start.
     */
    var startOffset: Double

    /**
     * JavaScript script source offset for the range end.
     */
    var endOffset: Double

    /**
     * Collected execution count of the source range.
     */
    var count: Double
}
