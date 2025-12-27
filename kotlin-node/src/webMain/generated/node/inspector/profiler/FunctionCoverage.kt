// Automatically generated - do not modify!

package node.inspector.profiler

/**
 * Coverage data for a JavaScript function.
 */
sealed external interface FunctionCoverage {
    /**
     * JavaScript function name.
     */
    var functionName: String

    /**
     * Source ranges inside the function with coverage data.
     */
    var ranges: js.array.ReadonlyArray<CoverageRange>

    /**
     * Whether coverage data for this function has block granularity.
     */
    var isBlockCoverage: Boolean
}
