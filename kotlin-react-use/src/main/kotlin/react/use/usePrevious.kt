package react.use

import react.useEffect
import react.useRef

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/usePrevious.ts)
 */
fun <T : Any> usePrevious(
    value: T,
): T? {
    val ref = useRef<T>()

    useEffect {
        ref.current = value
    }

    return ref.current
}
