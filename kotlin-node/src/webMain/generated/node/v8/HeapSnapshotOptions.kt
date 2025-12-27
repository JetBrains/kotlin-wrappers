// Automatically generated - do not modify!

package node.v8

sealed external interface HeapSnapshotOptions {
    /**
     * If true, expose internals in the heap snapshot.
     * @default false
     */
    var exposeInternals: Boolean?

    /**
     * If true, expose numeric values in artificial fields.
     * @default false
     */
    var exposeNumericValues: Boolean?
}
