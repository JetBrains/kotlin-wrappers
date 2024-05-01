package react

sealed external interface EffectBuilder {
    @JsName("push")
    fun cleanup(
        block: Cleanup,
    )
}
