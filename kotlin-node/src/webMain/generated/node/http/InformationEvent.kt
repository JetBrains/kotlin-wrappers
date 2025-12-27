// Automatically generated - do not modify!

package node.http

sealed external interface InformationEvent {
    var statusCode: Double
    var statusMessage: String
    var httpVersion: String
    var httpVersionMajor: Double
    var httpVersionMinor: Double
    var headers: IncomingHttpHeaders
    var rawHeaders: js.array.ReadonlyArray<String>
}
