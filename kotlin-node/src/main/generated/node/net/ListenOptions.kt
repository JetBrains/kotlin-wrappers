// Automatically generated - do not modify!

package node.net

import node.events.Abortable

sealed external interface ListenOptions : Abortable {
    var port: Number?
    var host: String?
    var backlog: Number?
    var path: String?
    var exclusive: Boolean?
    var readableAll: Boolean?
    var writableAll: Boolean?

    /**
     * @default false
     */
    var ipv6Only: Boolean?
}
