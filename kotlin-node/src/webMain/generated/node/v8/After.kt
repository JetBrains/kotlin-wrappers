// Automatically generated - do not modify!

package node.v8

/**
 * Called immediately after a promise continuation executes. This may be after a `then()`, `catch()`, or `finally()` handler or before an await after another await.
 * @since v17.1.0, v16.14.0
 */
sealed external interface After {
    operator fun invoke(promise: js.promise.Promise<Any?>)
}
