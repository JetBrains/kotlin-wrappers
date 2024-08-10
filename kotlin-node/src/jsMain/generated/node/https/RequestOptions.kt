// Generated by Karakum - do not modify it manually!

package node.https

import node.tls.PeerCertificate

sealed external interface RequestOptions : node.http.RequestOptions, node.tls.SecureContextOptions {
    var checkServerIdentity: ((hostname: String, cert: PeerCertificate) -> Throwable /* JsError */?)?
    var rejectUnauthorized: Boolean?// Defaults to true

    var servername: String?// SNI TLS Extension

}
