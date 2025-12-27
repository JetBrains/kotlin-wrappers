// Automatically generated - do not modify!

package node.dgram

import node.net.BlockList
import web.abort.Abortable

@js.objects.JsPlainObject
sealed external interface SocketOptions : Abortable {
    var type: SocketType
    var reuseAddr: Boolean?
    var reusePort: Boolean?

    /**
     * @default false
     */
    var ipv6Only: Boolean?
    var recvBufferSize: Double?
    var sendBufferSize: Double?
    var lookup: (
        (
        hostname: String,
        options: node.dns.LookupOneOptions,
        callback: (err: node.ErrnoException?, address: String, family: Double) -> Unit,
    ) -> Unit
    )?
    var receiveBlockList: BlockList?
    var sendBlockList: BlockList?
}
