// Automatically generated - do not modify!

package node.inspector.network

sealed external interface LoadingFailedEventDataType {
    /**
     * Request identifier.
     */
    var requestId: RequestId

    /**
     * Timestamp.
     */
    var timestamp: MonotonicTime

    /**
     * Resource type.
     */
    var type: ResourceType

    /**
     * Error message.
     */
    var errorText: String
}
