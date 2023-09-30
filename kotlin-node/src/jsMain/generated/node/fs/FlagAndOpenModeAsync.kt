package node.fs


sealed external interface FlagAndOpenMode {
    var mode: Mode?
    var flag: OpenMode?
}
