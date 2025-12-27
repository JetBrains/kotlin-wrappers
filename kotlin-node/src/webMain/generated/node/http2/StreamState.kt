// Automatically generated - do not modify!

package node.http2

// Http2Stream
sealed external interface StreamState {
    var localWindowSize: Double?
    var state: Double?
    var localClose: Double?
    var remoteClose: Double?

    /** @deprecated */
    var sumDependencyWeight: Double?

    /** @deprecated */
    var weight: Double?
}
