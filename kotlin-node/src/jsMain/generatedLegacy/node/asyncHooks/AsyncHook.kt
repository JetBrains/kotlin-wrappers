// Automatically generated - do not modify!

package node.asyncHooks

sealed external interface AsyncHook {
    /**
     * Enable the callbacks for a given AsyncHook instance. If no callbacks are provided enabling is a noop.
     */
    fun enable() /* : this */

    /**
     * Disable the callbacks for a given AsyncHook instance from the global pool of AsyncHook callbacks to be executed. Once a hook has been disabled it will not be called again until enabled.
     */
    fun disable() /* : this */
}
