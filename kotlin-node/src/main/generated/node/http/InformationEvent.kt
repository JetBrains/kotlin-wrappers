// Automatically generated - do not modify!

package node.http

import js.core.ReadonlyArray

sealed external interface InformationEvent {
    var statusCode: Number
    var statusMessage: String
    var httpVersion: String
    var httpVersionMajor: Number
    var httpVersionMinor: Number
    var headers: IncomingHttpHeaders
    var rawHeaders: ReadonlyArray<String>
}
