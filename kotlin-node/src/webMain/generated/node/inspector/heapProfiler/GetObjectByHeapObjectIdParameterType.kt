// Automatically generated - do not modify!

package node.inspector.heapProfiler

sealed external interface GetObjectByHeapObjectIdParameterType {
    var objectId: HeapSnapshotObjectId

    /**
     * Symbolic group name that can be used to release multiple objects.
     */
    var objectGroup: String?
}
