// Automatically generated - do not modify!

package node.https

sealed external interface RequestOptions :
    node.http.RequestOptions,
    node.tls.SecureContextOptions {
    var checkServerIdentity: ((hostname: String, cert: node.tls.DetailedPeerCertificate) -> js.errors.JsError?)?
    var rejectUnauthorized: Boolean? // Defaults to true

    var servername: String? // SNI TLS Extension
}
