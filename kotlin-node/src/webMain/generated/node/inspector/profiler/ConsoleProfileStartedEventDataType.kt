// Automatically generated - do not modify!

package node.inspector.profiler

@kotlinx.js.JsPlainObject
external interface ConsoleProfileStartedEventDataType {
    var id: String

    /**
     * Location of console.profile().
     */
    var location: node.inspector.debugger.Location

    /**
     * Profile title passed as an argument to console.profile().
     */
    var title: String?
}
