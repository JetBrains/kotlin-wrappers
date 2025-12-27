// Automatically generated - do not modify!

package node.inspector.debugger

sealed external interface EvaluateOnCallFrameReturnType {
    /**
     * Object wrapper for the evaluation result.
     */
    var result: node.inspector.runtime.RemoteObject

    /**
     * Exception details.
     */
    var exceptionDetails: node.inspector.runtime.ExceptionDetails?
}
