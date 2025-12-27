// Automatically generated - do not modify!

package node.inspector.debugger

sealed external interface SetBreakpointReturnType {
    /**
     * Id of the created breakpoint for further reference.
     */
    var breakpointId: BreakpointId

    /**
     * Location this breakpoint resolved into.
     */
    var actualLocation: Location
}
