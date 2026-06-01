// Automatically generated - do not modify!

package electron.core

@kotlinx.js.JsPlainObject
external interface EnableHeapProfilingOptions {
// Docs: https://electronjs.org/docs/api/structures/enable-heap-profiling-options
    /**
     * Controls which processes are profiled. Equivalent to `--memlog` in Chrome.
     * Default is `all`.
     */
    var mode: (EnableHeapProfilingOptionsMode)?

    /**
     * Controls the sampling interval in bytes. The lower the interval, the more
     * precise the profile is. However it comes at the cost of performance. Default is
     * `100000` (100KB). That is enough to observe allocation sites that make
     * allocations >500KB total, where total equals to a single allocation size times
     * the number of such allocations at the same call site. Equivalent to
     * `--memlog-sampling-rate` in Chrome. Must be an integer between `1000` and
     * `10000000`.
     */
    var samplingRate: Double?

    /**
     * Controls the type of metadata recorded for each allocation. Equivalent to
     * `--memlog-stack-mode` in Chrome. Default is `native`.
     */
    var stackMode: (EnableHeapProfilingOptionsStackMode)?
}
