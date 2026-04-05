// Automatically generated - do not modify!

package node.inspector.network

@kotlinx.js.JsPlainObject
external interface DataReceivedEventDataType {
    /**
     * Request identifier.
     */
    var requestId: RequestId

    /**
     * Timestamp.
     */
    var timestamp: MonotonicTime

    /**
     * Data chunk length.
     */
    var dataLength: Double

    /**
     * Actual bytes received (might be less than dataLength for compressed encodings).
     */
    var encodedDataLength: Double

    /**
     * Data that was received.
     * @experimental
     */
    var data: String?
}
