package node.dgram

import node.events.Abortable


sealed external interface SocketOptions : Abortable {
    var type: SocketType
    var reuseAddr: Boolean?

    /**
     * @default false
     */
    var ipv6Only: Boolean?
    var recvBufferSize: Double?
    var sendBufferSize: Double?
    var lookup: ((hostname: String, options: node.dns.LookupOneOptions, callback: (err: node.ErrnoException?, address: String, family: Double) -> Unit) -> Unit)?
}
