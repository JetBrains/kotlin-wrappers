// Automatically generated - do not modify!

package node.inspector.network

/**
 * WebSocket response data.
 */
sealed external interface WebSocketResponse {
    /**
     * HTTP response status code.
     */
    var status: Double

    /**
     * HTTP response status text.
     */
    var statusText: String

    /**
     * HTTP response headers.
     */
    var headers: Headers
}
