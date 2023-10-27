package node.childProcess


sealed external interface ExecSyncOptions : CommonExecOptions {
    var shell: String?
}
