package node.dns


sealed external interface ResolverOptions {
    var timeout: Double?

    /**
     * @default 4
     */
    var tries: Double?
}
