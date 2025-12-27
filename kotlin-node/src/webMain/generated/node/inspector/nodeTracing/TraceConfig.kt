// Automatically generated - do not modify!

package node.inspector.nodeTracing

sealed external interface TraceConfig {
    /**
     * Controls how the trace buffer stores data.
     */
    var recordMode: String?

    /**
     * Included category filters.
     */
    var includedCategories: js.array.ReadonlyArray<String>
}
