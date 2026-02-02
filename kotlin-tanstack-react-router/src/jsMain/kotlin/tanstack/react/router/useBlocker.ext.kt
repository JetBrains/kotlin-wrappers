package tanstack.react.router

fun useBlocker(
    shouldBlockFn: ShouldBlockFn,
) {
    useBlocker(
        options = UseBlockerOptions(
            shouldBlockFn = shouldBlockFn,
        ),
    )
}

fun useBlocker(
    shouldBlockFn: ShouldBlockFn,
    enableBeforeUnload: (() -> Boolean)? = undefined,
    disabled: Boolean? = undefined,
) {
    useBlocker(
        options = UseBlockerOptions(
            shouldBlockFn = shouldBlockFn,
            enableBeforeUnload = enableBeforeUnload,
            disabled = disabled,
        ),
    )
}
