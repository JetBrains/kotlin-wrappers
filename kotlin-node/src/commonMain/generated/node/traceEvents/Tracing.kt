// Generated by Karakum - do not modify it manually!

package node.traceEvents

/**
 * The `Tracing` object is used to enable or disable tracing for sets of
 * categories. Instances are created using the
 * `trace_events.createTracing()` method.
 *
 * When created, the `Tracing` object is disabled. Calling the
 * `tracing.enable()` method adds the categories to the set of enabled trace
 * event categories. Calling `tracing.disable()` will remove the categories
 * from the set of enabled trace event categories.
 */
sealed external interface Tracing {
    /**
     * A comma-separated list of the trace event categories covered by this
     * `Tracing` object.
     * @since v10.0.0
     */
    val categories: String

    /**
     * Disables this `Tracing` object.
     *
     * Only trace event categories _not_ covered by other enabled `Tracing`
     * objects and _not_ specified by the `--trace-event-categories` flag
     * will be disabled.
     *
     * ```js
     * import trace_events from 'node:trace_events';
     * const t1 = trace_events.createTracing({ categories: ['node', 'v8'] });
     * const t2 = trace_events.createTracing({ categories: ['node.perf', 'node'] });
     * t1.enable();
     * t2.enable();
     *
     * // Prints 'node,node.perf,v8'
     * console.log(trace_events.getEnabledCategories());
     *
     * t2.disable(); // Will only disable emission of the 'node.perf' category
     *
     * // Prints 'node,v8'
     * console.log(trace_events.getEnabledCategories());
     * ```
     * @since v10.0.0
     */
    fun disable()

    /**
     * Enables this `Tracing` object for the set of categories covered by
     * the `Tracing` object.
     * @since v10.0.0
     */
    fun enable()

    /**
     * `true` only if the `Tracing` object has been enabled.
     * @since v10.0.0
     */
    val enabled: Boolean
}
