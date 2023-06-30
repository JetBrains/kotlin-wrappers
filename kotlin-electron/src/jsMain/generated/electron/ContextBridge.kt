package electron


external interface ContextBridge {
    // Docs: https://electronjs.org/docs/api/context-bridge
    fun exposeInIsolatedWorld(worldId: Double, apiKey: String, api: Any?): Unit
    fun exposeInMainWorld(apiKey: String, api: Any?): Unit
}
