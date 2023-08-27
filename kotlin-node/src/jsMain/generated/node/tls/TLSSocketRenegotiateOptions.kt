package node.tls


sealed external interface TLSSocketRenegotiateOptions {
    var rejectUnauthorized: Boolean?
    var requestCert: Boolean?
}
