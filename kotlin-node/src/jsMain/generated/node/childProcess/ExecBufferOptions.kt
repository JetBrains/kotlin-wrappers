package node.childProcess


sealed external interface ExecBufferOptions : ExecOptions {
    var encoding: String /* 'buffer' */?
}
