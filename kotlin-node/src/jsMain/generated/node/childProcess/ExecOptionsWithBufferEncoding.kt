package node.childProcess


sealed external interface ExecOptionsWithBufferEncoding : ExecOptions {
    var encoding: node.buffer.BufferEncoding?// specify `null`.

}
