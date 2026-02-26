// Automatically generated - do not modify!

package node.v8

/**
 * Called when the promise receives a resolution or rejection value. This may occur synchronously in the case of {@link Promise.resolve()} or
 * {@link Promise.reject()}.
 * @since v17.1.0, v16.14.0
 */
sealed external interface Settled {
    operator fun invoke(promise: js.promise.Promise<Any?>)
}
