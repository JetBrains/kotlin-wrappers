// Automatically generated - do not modify!

package node.childProcess

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface PromiseWithChild<T> : js.promise.Promise<T> {
    var child: ChildProcess
}
