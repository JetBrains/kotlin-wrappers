// Automatically generated - do not modify!

package node.childProcess

sealed external interface SpawnOptionsWithStdioTuple<Stdin : Any /* StdioNull | StdioPipe */, Stdout : Any /* StdioNull | StdioPipe */, Stderr : Any /* StdioNull | StdioPipe */> :
    SpawnOptions {
    override var stdio: StdioOptions? /* [Stdin, Stdout, Stderr] */
}
