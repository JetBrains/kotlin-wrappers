package node.childProcess


sealed external interface ExecFileSyncOptions : CommonExecOptions {
    var shell: Any? /* boolean | string | undefined */
}
