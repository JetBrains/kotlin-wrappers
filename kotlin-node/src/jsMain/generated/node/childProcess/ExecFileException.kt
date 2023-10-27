package node.childProcess


sealed external interface ExecFileException : ExecException, node.ErrnoException {
    override var code: dynamic
}
