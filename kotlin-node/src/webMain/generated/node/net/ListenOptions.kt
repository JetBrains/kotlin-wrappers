// Automatically generated - do not modify!

package node.net

import web.abort.Abortable

@kotlinx.js.JsPlainObject
sealed external interface ListenOptions : Abortable {
    var backlog: Double?
    var exclusive: Boolean?
    var host: String?

    /**
     * @default false
     */
    var ipv6Only: Boolean?
    var reusePort: Boolean?
    var path: String?
    var port: Double?
    var readableAll: Boolean?
    var writableAll: Boolean?
}
