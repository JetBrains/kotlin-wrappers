package react

import react.internal.buildCleanupCallback
import react.raw.useEffectRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
@Deprecated(
    "`useEffectWithCleanup` is deprecated, use `useEffect` with `awaitCleanup` extension instead",
    ReplaceWith("react.useEffect"),
)
fun useEffectWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useEffectRaw(callback)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
@Deprecated(
    "`useEffectWithCleanup` is deprecated, use `useEffect` with `awaitCleanup` extension instead",
    ReplaceWith("react.useEffect"),
)
fun useEffectWithCleanup(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useEffectRaw(callback, dependencies)
}

/**
 * [Online Documentation](https://react.dev/reference/react/useEffect)
 */
@Deprecated(
    "`useEffectOnceWithCleanup` is deprecated, use `useEffectOnce` with `awaitCleanup` extension instead",
    ReplaceWith("react.useEffectOnce"),
)
fun useEffectOnceWithCleanup(
    effect: CleanupBuilder.() -> Unit,
) {
    val callback = buildCleanupCallback(effect)
    useEffectRaw(callback, emptyArray())
}
