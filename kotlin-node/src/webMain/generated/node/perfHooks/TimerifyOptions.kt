// Automatically generated - do not modify!

package node.perfHooks

sealed external interface TimerifyOptions {
    /**
     * A histogram object created using `perf_hooks.createHistogram()` that will record runtime
     * durations in nanoseconds.
     */
    var histogram: RecordableHistogram?
}
