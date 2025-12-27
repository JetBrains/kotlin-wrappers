// Automatically generated - do not modify!

package node.inspector.debugger

sealed external interface BreakpointResolvedEventDataType {
    /**
     * Breakpoint unique identifier.
     */
    var breakpointId: BreakpointId

    /**
     * Actual breakpoint location.
     */
    var location: Location
}
