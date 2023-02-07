// Automatically generated - do not modify!

package node.childProcess

sealed external interface CommonExecOptions : CommonOptions {
    var input: Any? /* string | NodeJS.ArrayBufferView */
    var stdio: StdioOptions?
    var killSignal: Any? /* NodeJS.Signals | number */
    var maxBuffer: Number?
    var encoding: Any? /* BufferEncoding | 'buffer' */
}
