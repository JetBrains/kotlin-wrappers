package node.dns


sealed external interface LookupOptions {
    var family: Double?
    var hints: Double?
    var all: Boolean?

    /**
     * @default true
     */
    var verbatim: Boolean?
}
