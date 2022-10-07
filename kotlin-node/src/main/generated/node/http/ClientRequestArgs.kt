// Automatically generated - do not modify!

package node.http

import node.net.LookupFunction
import node.net.Socket
import web.abort.AbortSignal

sealed external interface ClientRequestArgs {
    var signal: AbortSignal?
    var protocol: String?
    var host: String?
    var hostname: String?
    var family: Number?
    var port: String?
    var defaultPort: Any? /* number | string */
    var localAddress: String?
    var socketPath: String?

    /**
     * @default 8192
     */
    var maxHeaderSize: Number?
    var method: String?
    var path: String?
    var headers: OutgoingHttpHeaders?
    var auth: String?
    var agent: Any? /* Agent | boolean */
    var _defaultAgent: Agent?
    var timeout: Number?
    var setHost: Boolean?

    // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
    var createConnection: (((options: ClientRequestArgs, oncreate: (error: Error, socket: Socket) -> Unit) -> Socket))?
    var lookup: LookupFunction?
}
