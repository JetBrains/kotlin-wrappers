package node.dns


sealed external interface LookupAllOptions : LookupOptions {
    @JsName("all")
    var requiredAll: Boolean
}
