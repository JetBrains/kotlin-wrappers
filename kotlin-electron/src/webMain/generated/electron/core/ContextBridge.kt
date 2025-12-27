// Automatically generated - do not modify!

package electron.core

external interface ContextBridge {
// Docs: https://electronjs.org/docs/api/context-bridge
    /**
     * A copy of the resulting value from executing the function in the main world.
     * Refer to the table on how values are copied between worlds.
     *
     * @experimental
     */
    fun executeInMainWorld(executionScript: ExecutionScript): Any?

    fun exposeInIsolatedWorld(
        worldId: Double,
        apiKey: String,
        api: Any?,
    )

    fun exposeInMainWorld(
        apiKey: String,
        api: Any?,
    )
}
