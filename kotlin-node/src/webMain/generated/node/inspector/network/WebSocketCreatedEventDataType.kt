// Automatically generated - do not modify!

package node.inspector.network

sealed external interface WebSocketCreatedEventDataType {
    /**
     * Request identifier.
     */
    var requestId: RequestId

    /**
     * WebSocket request URL.
     */
    var url: String

    /**
     * Request initiator.
     */
    var initiator: Initiator
}
