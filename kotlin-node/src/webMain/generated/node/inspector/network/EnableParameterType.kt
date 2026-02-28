// Automatically generated - do not modify!

package node.inspector.network

sealed external interface EnableParameterType {
    /**
     * Buffer size in bytes to use when preserving network payloads (XHRs, etc).
     * @experimental
     */
    var maxTotalBufferSize: Double?

    /**
     * Per-resource buffer size in bytes to use when preserving network payloads (XHRs, etc).
     * @experimental
     */
    var maxResourceBufferSize: Double?
}
