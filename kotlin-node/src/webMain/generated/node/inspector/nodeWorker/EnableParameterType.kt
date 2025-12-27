// Automatically generated - do not modify!

package node.inspector.nodeWorker

sealed external interface EnableParameterType {
    /**
     * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
     * message to run them.
     */
    var waitForDebuggerOnStart: Boolean
}
