package node.childProcess


sealed external interface SpawnOptionsWithoutStdio : SpawnOptions {
    override var stdio: Any? /* StdioPipeNamed | StdioPipe[] | undefined */
}
