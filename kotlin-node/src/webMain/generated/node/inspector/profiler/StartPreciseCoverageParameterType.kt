// Automatically generated - do not modify!

package node.inspector.profiler

sealed external interface StartPreciseCoverageParameterType {
    /**
     * Collect accurate call counts beyond simple 'covered' or 'not covered'.
     */
    var callCount: Boolean?

    /**
     * Collect block-based coverage.
     */
    var detailed: Boolean?
}
