// Automatically generated - do not modify!

package node.inspector.network

/**
 * Information about the request initiator.
 */
sealed external interface Initiator {
    /**
     * Type of this initiator.
     */
    var type: String

    /**
     * Initiator JavaScript stack trace, set for Script only.
     * Requires the Debugger domain to be enabled.
     */
    var stack: node.inspector.runtime.StackTrace?

    /**
     * Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.
     */
    var url: String?

    /**
     * Initiator line number, set for Parser type or for Script type (when script is importing
     * module) (0-based).
     */
    var lineNumber: Double?

    /**
     * Initiator column number, set for Parser type or for Script type (when script is importing
     * module) (0-based).
     */
    var columnNumber: Double?

    /**
     * Set if another request triggered this request (e.g. preflight).
     */
    var requestId: RequestId?
}
