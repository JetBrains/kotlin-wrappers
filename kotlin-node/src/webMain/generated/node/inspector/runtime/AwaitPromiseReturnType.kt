// Automatically generated - do not modify!

package node.inspector.runtime

sealed external interface AwaitPromiseReturnType {
    /**
     * Promise result. Will contain rejected value if promise was rejected.
     */
    var result: RemoteObject

    /**
     * Exception details if stack strace is available.
     */
    var exceptionDetails: ExceptionDetails?
}
