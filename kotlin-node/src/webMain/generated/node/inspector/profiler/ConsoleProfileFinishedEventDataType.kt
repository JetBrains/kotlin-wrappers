// Automatically generated - do not modify!

package node.inspector.profiler

sealed external interface ConsoleProfileFinishedEventDataType {
    var id: String

    /**
     * Location of console.profileEnd().
     */
    var location: node.inspector.debugger.Location
    var profile: Profile

    /**
     * Profile title passed as an argument to console.profile().
     */
    var title: String?
}
