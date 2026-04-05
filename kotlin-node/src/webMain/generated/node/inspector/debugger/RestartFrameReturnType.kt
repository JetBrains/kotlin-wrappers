// Automatically generated - do not modify!

package node.inspector.debugger

@kotlinx.js.JsPlainObject
external interface RestartFrameReturnType {
    /**
     * New stack trace.
     */
    var callFrames: js.array.ReadonlyArray<CallFrame>

    /**
     * Async stack trace, if any.
     */
    var asyncStackTrace: node.inspector.runtime.StackTrace?

    /**
     * Async stack trace, if any.
     * @experimental
     */
    var asyncStackTraceId: node.inspector.runtime.StackTraceId?
}
