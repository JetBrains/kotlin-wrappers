// Generated by Karakum - do not modify it manually!

package node.inspector.runtime

sealed external interface CallFunctionOnReturnType {
    /**
     * Call result.
     */
    var result: RemoteObject

    /**
     * Exception details.
     */
    var exceptionDetails: ExceptionDetails?
}
