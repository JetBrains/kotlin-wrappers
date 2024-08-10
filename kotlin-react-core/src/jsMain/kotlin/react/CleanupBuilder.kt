package react

sealed external interface CleanupBuilder {
    @JsName("push")
    fun onCleanup(
        block: Cleanup,
    )
}
