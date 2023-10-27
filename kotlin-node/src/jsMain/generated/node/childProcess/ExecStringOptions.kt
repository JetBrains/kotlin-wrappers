package node.childProcess


sealed external interface ExecStringOptions : ExecOptions {
    var encoding: node.buffer.BufferEncoding
}
