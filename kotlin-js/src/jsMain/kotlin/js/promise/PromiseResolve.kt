package js.promise

sealed external interface PromiseResolve<T> {
    @nativeInvoke
    @Suppress("DEPRECATION")
    operator fun invoke(
        value: T,
    )

    @nativeInvoke
    @Suppress("DEPRECATION")
    operator fun invoke(
        value: PromiseResult<T>,
    )
}
