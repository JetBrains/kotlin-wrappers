// Automatically generated - do not modify!

package node.childProcess

sealed external interface SpawnSyncReturns<T> {
    var pid: Number
    var output: Any /* Array<T | null> */
    var stdout: T
    var stderr: T
    var status: Number?
    var signal: node.process.Signals?
    var error: Error?
}
