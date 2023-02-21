package react.use

import react.useRef

/**
 * [Original](https://github.com/Andarist/use-constant/blob/main/src/index.ts)
 */
fun <T : Any> useConstant(
    callback: () -> T,
): T {
    val ref = useRef<T>()

    return ref.current ?: run {
        val current = callback()
        ref.current = current
        current
    }
}
