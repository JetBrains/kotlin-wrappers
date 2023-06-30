package electron


external interface TraceConfig {
// Docs: https://electronjs.org/docs/api/structures/trace-config
    /**
     * if true, filter event data according to a specific list of events that have been
     * manually vetted to not include any PII. See the implementation in Chromium for
     * specifics.
     */
    var enable_argument_filter: Boolean?

    /**
     * a list of tracing categories to exclude. Can include glob-like patterns using
     * `*` at the end of the category name. See tracing categories for the list of
     * categories.
     */
    var excluded_categories: js.core.ReadonlyArray<String>?

    /**
     * a list of histogram names to report with the trace.
     */
    var histogram_names: js.core.ReadonlyArray<String>?

    /**
     * a list of tracing categories to include. Can include glob-like patterns using
     * `*` at the end of the category name. See tracing categories for the list of
     * categories.
     */
    var included_categories: js.core.ReadonlyArray<String>?

    /**
     * a list of process IDs to include in the trace. If not specified, trace all
     * processes.
     */
    var included_process_ids: js.core.ReadonlyArray<Double>?

    /**
     * if the `disabled-by-default-memory-infra` category is enabled, this contains
     * optional additional configuration for data collection. See the Chromium
     * memory-infra docs for more information.
     */
    var memory_dump_config: js.core.ReadonlyRecord<String, Any>?

    /**
     * Can be `record-until-full`, `record-continuously`, `record-as-much-as-possible`
     * or `trace-to-console`. Defaults to `record-until-full`.
     */
    var recording_mode: (TraceConfigRecording_mode)?

    /**
     * maximum size of the trace recording buffer in events.
     */
    var trace_buffer_size_in_events: Double?

    /**
     * maximum size of the trace recording buffer in kilobytes. Defaults to 100MB.
     */
    var trace_buffer_size_in_kb: Double?
}
