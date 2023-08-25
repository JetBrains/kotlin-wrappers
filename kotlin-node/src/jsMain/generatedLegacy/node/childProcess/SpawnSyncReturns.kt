// Automatically generated - do not modify!

package node.childProcess

import node.process.Signals

sealed external interface SpawnSyncReturns<T> {
    var pid: Number
    var output: Any /* Array<T | null> */
    var stdout: T
    var stderr: T
    var status: Number?
    var signal: Signals?
    var error: Error?
}
