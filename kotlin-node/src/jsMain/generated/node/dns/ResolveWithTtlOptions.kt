package node.dns


sealed external interface ResolveWithTtlOptions : ResolveOptions {
    override var ttl: Boolean
}
