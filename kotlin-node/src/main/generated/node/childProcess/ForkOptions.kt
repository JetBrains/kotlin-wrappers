// Automatically generated - do not modify!

package node.childProcess

import js.core.ReadonlyArray
import node.events.Abortable

sealed external interface ForkOptions : ProcessEnvOptions, MessagingOptions, Abortable {
    var execPath: String?
    var execArgv: ReadonlyArray<String>?
    var silent: Boolean?
    var stdio: StdioOptions?
    var detached: Boolean?
    var windowsVerbatimArguments: Boolean?
}
