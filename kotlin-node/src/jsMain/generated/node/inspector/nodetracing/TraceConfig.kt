// Generated by Karakum - do not modify it manually!

package node.inspector.nodetracing

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
