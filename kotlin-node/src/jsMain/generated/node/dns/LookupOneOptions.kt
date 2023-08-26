package node.dns


sealed external interface LookupOneOptions : LookupOptions {
    override var all: Boolean?
}
