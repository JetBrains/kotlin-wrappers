// Generated by Karakum - do not modify it manually!

package node.http2

sealed external interface ClientSessionOptions : SessionOptions {
    var maxReservedRemoteStreams: Double?
    var createConnection: ((authority: web.url.URL, option: SessionOptions) -> node.stream.Duplex)?
    var protocol: ClientSessionOptionsProtocol?
}
