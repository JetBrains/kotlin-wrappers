package node.childProcess


sealed external interface ExecFileOptionsWithBufferEncoding : ExecFileOptions {
    var encoding: String /* 'buffer' */?
}
