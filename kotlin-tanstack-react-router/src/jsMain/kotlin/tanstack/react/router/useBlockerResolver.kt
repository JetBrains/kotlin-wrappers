package tanstack.react.router

internal fun useBlockerResolver(
    options: UseBlockerOptions,
): BlockerResolver? {
    val resolver = useBlocker(
        options = UseBlockerOptions.copy(options, withResolver = true),
    ) ?: return null

    return if (isBlockerResolver(resolver)) resolver else null
}

fun useBlockerResolver(
    shouldBlockFn: ShouldBlockFn,
): BlockerResolver? =
    useBlockerResolver(
        options = UseBlockerOptions(
            shouldBlockFn = shouldBlockFn,
        ),
    )

fun useBlockerResolver(
    shouldBlockFn: ShouldBlockFn,
    enableBeforeUnload: (() -> Boolean)? = undefined,
    disabled: Boolean? = undefined,
): BlockerResolver? =
    useBlockerResolver(
        options = UseBlockerOptions(
            shouldBlockFn = shouldBlockFn,
            enableBeforeUnload = enableBeforeUnload,
            disabled = disabled,
        )
    )
