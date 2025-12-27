// Automatically generated - do not modify!

package node.inspector.debugger

sealed external interface SetBreakpointParameterType {
    /**
     * Location to set breakpoint in.
     */
    var location: Location

    /**
     * Expression to use as a breakpoint condition. When specified, debugger will only stop on the breakpoint if this expression evaluates to true.
     */
    var condition: String?
}
