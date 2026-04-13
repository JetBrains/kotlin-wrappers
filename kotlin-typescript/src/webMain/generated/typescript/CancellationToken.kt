// Automatically generated - do not modify!

package typescript

external interface CancellationToken {
    fun isCancellationRequested(): Boolean

    /** @throws OperationCanceledException if isCancellationRequested is true */
    fun throwIfCancellationRequested()
}
