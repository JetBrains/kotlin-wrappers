// Automatically generated - do not modify!

package node.inspector.network

sealed external interface WebSocketHandshakeResponseReceivedEventDataType {
    /**
     * Request identifier.
     */
    var requestId: RequestId

    /**
     * Timestamp.
     */
    var timestamp: MonotonicTime

    /**
     * WebSocket response data.
     */
    var response: WebSocketResponse
}
