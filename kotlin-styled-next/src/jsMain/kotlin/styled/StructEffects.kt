package styled

import react.*
import react.raw.useMemoRaw

internal fun <T> useStructMemo(
    vararg dependencies: Any?,
    callback: () -> T,
): T {
    return useMemoRaw(getMemoizedCallback(dependencies, callback), dependencies)
}

internal fun useCustomInsertionEffect(
    vararg dependencies: Any?,
    effect: CleanupBuilder.() -> Unit,
) {
    if (supportsInsertionEffect === undefined) {
        useLayoutEffectWithCleanup(dependencies = dependencies, effect = effect)
    } else {
        useInsertionEffectWithCleanup(dependencies = dependencies, effect = effect)
    }
}

private data class MemoizedResult<T>(
    val args: Array<out dynamic>,
    val value: T,
    val cleanups: Array<Cleanup>,
) {
    fun cleanup() {
        cleanups.forEach { it() }
    }
}

private fun <T> MutableRefObject<MemoizedResult<T>>.runCallback(
    callback: () -> T,
    args: Array<out dynamic>,
): T {
    current?.apply {
        if (argsEqual(args)) return value
    }
    val cleanups = arrayOf<Cleanup>()
    return callback().also { result ->
        current = MemoizedResult(args, result, cleanups)
    }
}


private fun <T> getMemoizedCallback(
    args: Array<out dynamic>,
    callback: () -> T,
): () -> T {
    val prevResultRef = useRef<MemoizedResult<T>>(null)
    return {
        prevResultRef.runCallback(callback, args)
    }
}

private fun <T> MemoizedResult<T>?.argsEqual(args: Array<out dynamic>): Boolean {
    if (this == null) return false
    if (this.args.size != args.size) {
        if (isDevelopment()) console.warn("Calling useEffect with different number of dependencies: ${this.args.joinToString()} and ${args.joinToString()}")
        return false
    }
    var index = -1
    return this.args.all { prevArg: Any ->
        index++
        val newArg: Any = args[index]
        prevArg == newArg
    }
}
