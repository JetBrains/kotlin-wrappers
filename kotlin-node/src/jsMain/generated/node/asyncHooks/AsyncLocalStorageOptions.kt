// Automatically generated - do not modify!

package node.asyncHooks

sealed external interface AsyncLocalStorageOptions<T> {
    /**
     * Optional callback invoked before a store is propagated to a new async resource.
     * Returning `true` allows propagation, returning `false` avoids it. Default is to propagate always.
     * @param type The type of async event.
     * @param store The current store.
     * @since v18.13.0
     */
    var onPropagate: (((type: String, store: T) -> Boolean))?
}
