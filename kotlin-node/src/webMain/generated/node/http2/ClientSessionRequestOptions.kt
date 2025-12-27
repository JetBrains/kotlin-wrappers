// Automatically generated - do not modify!

package node.http2

import web.abort.AbortSignal

sealed external interface ClientSessionRequestOptions {
    var endStream: Boolean?
    var exclusive: Boolean?
    var parent: Double?
    var waitForTrailers: Boolean?
    var signal: AbortSignal?
}
