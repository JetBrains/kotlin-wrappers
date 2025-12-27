// Automatically generated - do not modify!

package node.inspector.network

sealed external interface ResponseReceivedEventDataType {
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
     * Response data.
     */
    var response: Response
}
