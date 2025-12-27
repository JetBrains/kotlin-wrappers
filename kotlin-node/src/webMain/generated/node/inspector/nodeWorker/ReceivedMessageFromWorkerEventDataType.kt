// Automatically generated - do not modify!

package node.inspector.nodeWorker

sealed external interface ReceivedMessageFromWorkerEventDataType {
    /**
     * Identifier of a session which sends a message.
     */
    var sessionId: SessionID
    var message: String
}
