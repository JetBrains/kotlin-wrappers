// Automatically generated - do not modify!

package typescript

sealed external interface CancellationToken {
    fun isCancellationRequested(): Boolean

    /** @throws OperationCanceledException if isCancellationRequested is true */
    fun throwIfCancellationRequested()
}
