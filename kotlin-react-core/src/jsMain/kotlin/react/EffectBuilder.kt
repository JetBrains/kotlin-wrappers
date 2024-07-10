package react

sealed external interface EffectBuilder {
    @Deprecated(
        message = """
        `EffectBuilder.cleanup` method usage is unsafe and will be removed in a future version.

        Please use suspend functions with "auto-cleanup" instead:
            * `web.events.subscribe`
            * `web.events.once`
            * `web.animations.awaitAnimationFrame`
            * your custom suspend adapter

        Or use additional hook wrappers like:
          * `useEffectWithCleanup`
          * `useEffectOnceWithCleanup`
          * `useLayoutEffectWithCleanup`
          * `useLayoutEffectOnceWithCleanup`
          * ...
        """,
    )
    @JsName("push")
    fun cleanup(
        block: Cleanup,
    )
}
