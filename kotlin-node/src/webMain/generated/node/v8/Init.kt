// Automatically generated - do not modify!

package node.v8

/**
 * Called when a promise is constructed. This does not mean that corresponding before/after events will occur, only that the possibility exists. This will
 * happen if a promise is created without ever getting a continuation.
 * @since v17.1.0, v16.14.0
 * @param promise The promise being created.
 * @param parent The promise continued from, if applicable.
 */
sealed external interface Init {
    operator fun invoke(
        promise: js.promise.Promise<Any?>,
        parent: js.promise.Promise<Any?>,
    )
}
