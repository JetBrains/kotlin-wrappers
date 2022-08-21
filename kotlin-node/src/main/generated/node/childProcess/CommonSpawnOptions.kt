// Automatically generated - do not modify!

package node.childProcess

import node.events.Abortable

sealed external interface CommonSpawnOptions : CommonOptions, MessagingOptions, Abortable {
    var argv0: String?
    var stdio: StdioOptions?
    var shell: Any? /* boolean | string */
    var windowsVerbatimArguments: Boolean?
}
