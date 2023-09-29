package node.fs


sealed external interface ReadStreamOptions : StreamOptions {
    var end: Double?
}
