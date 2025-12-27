// Automatically generated - do not modify!

package node.inspector.network

sealed external interface RequestWillBeSentEventDataType {
    /**
     * Request identifier.
     */
    var requestId: RequestId

    /**
     * Request data.
     */
    var request: Request

    /**
     * Request initiator.
     */
    var initiator: Initiator

    /**
     * Timestamp.
     */
    var timestamp: MonotonicTime

    /**
     * Timestamp.
     */
    var wallTime: TimeSinceEpoch
}
