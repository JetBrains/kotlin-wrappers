// Generated by Karakum - do not modify it manually!


package node.inspector.debugger


sealed external interface SetBreakpointByUrlReturnType {
    /**
     * Id of the created breakpoint for further reference.
     */
    var breakpointId: BreakpointId

    /**
     * List of the locations this breakpoint resolved into upon addition.
     */
    var locations: js.array.ReadonlyArray<Location>
}