// Automatically generated - do not modify!

package node.https

sealed external interface AgentOptions :
    node.http.AgentOptions,
    node.tls.ConnectionOptions {
    var maxCachedSessions: Double?

    @Suppress("VAR_TYPE_MISMATCH_ON_OVERRIDE")
    override var port: Double
}
