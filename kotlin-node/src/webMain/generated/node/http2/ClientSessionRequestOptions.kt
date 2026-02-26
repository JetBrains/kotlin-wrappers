// Automatically generated - do not modify!

package node.http2

sealed external interface ClientSessionRequestOptions {
    var endStream: Boolean?
    var exclusive: Boolean?
    var parent: Double?
    var waitForTrailers: Boolean?
    var signal: web.abort.AbortSignal?
}
