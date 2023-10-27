package node.childProcess


sealed external interface ExecOptionsWithStringEncoding : ExecOptions {
    var encoding: node.buffer.BufferEncoding
}
