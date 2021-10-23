package styled

import react.*

private data class MemoizedResult<T>(
    val args: Array<out dynamic>,
    val value: T,
    val cleanups: Array<Cleanup>
) {
    fun cleanup() {
        cleanups.forEach { it() }
    }
}

internal fun <T> useStructMemo(vararg dependencies: dynamic, callback: EffectBuilder.() -> T): T {
    return rawUseMemo(getMemoizedCallback(dependencies, callback), dependencies)!!
}

internal fun <T> getMemoizedCallback(
    args: Array<out dynamic>,
    callback: EffectBuilder.() -> T,
): () -> T {
    val prevResultRef = useRef<MemoizedResult<T>>(null)
    useEffect(prevResultRef) {
        cleanup {
            prevResultRef.current?.cleanup()
        }
    }
    return {
        val prevResult = prevResultRef.current
        val equal = prevResult.argsEqual(args)
        if (prevResult != null && equal) prevResult.value else {
            prevResult?.cleanup()
            val cleanups = arrayOf<Cleanup>()
            callback(cleanups.unsafeCast<EffectBuilder>()).also { result ->
                prevResultRef.current = MemoizedResult(args, result, cleanups)
            }
        }
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
