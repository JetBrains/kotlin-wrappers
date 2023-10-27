package node.childProcess


sealed external interface ExecFileOptionsWithOtherEncoding : ExecFileOptions {
    var encoding: node.buffer.BufferEncoding
}
