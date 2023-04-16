// Automatically generated - do not modify!

package node.http

import js.core.ReadonlyArray
import node.net.LookupFunction
import node.net.Socket
import web.abort.AbortSignal

sealed external interface ClientRequestArgs {
    var _defaultAgent: Agent?
    var agent: Any? /* Agent | boolean */
    var auth: String?

    // https://github.com/nodejs/node/blob/master/lib/_http_client.js#L278
    var createConnection: (((options: ClientRequestArgs, oncreate: (error: Error, socket: Socket) -> Unit) -> Socket))?
    var defaultPort: Any? /* number | string */
    var family: Number?
    var headers: OutgoingHttpHeaders?
    var hints: Int? /* LookupOptions['hints'] */
    var host: String?
    var hostname: String?
    var insecureHTTPParser: Boolean?
    var localAddress: String?
    var localPort: Number?
    var lookup: LookupFunction?

    /**
     * @default 16384
     */
    var maxHeaderSize: Number?
    var method: String?
    var path: String?
    var port: String?
    var protocol: String?
    var setHost: Boolean?
    var signal: AbortSignal?
    var socketPath: String?
    var timeout: Number?
    var uniqueHeaders: ReadonlyArray<Any /* string | string[] */>?
    var joinDuplicateHeaders: Boolean?
}
