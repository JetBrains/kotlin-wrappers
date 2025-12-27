// Automatically generated - do not modify!

package node.inspector.debugger

sealed external interface PauseOnAsyncCallParameterType {
    /**
     * Debugger will pause when async call with given stack trace is started.
     */
    var parentStackTraceId: node.inspector.runtime.StackTraceId
}
