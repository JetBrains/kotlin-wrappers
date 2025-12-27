// Automatically generated - do not modify!

package node.http2

import node.http.OutgoingHttpHeaders

sealed external interface ServerStreamFileResponseOptions {
    var statCheck: ((stats: node.fs.Stats, headers: OutgoingHttpHeaders, statOptions: StatOptions) -> Unit)?
    var waitForTrailers: Boolean?
    var offset: Double?
    var length: Double?
}
