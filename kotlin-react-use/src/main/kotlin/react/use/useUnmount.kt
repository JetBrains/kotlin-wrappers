package react.use

import react.useEffectOnce

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useUnmount.ts)
 */
fun useUnmount(
    callback: () -> Unit,
) {
    val latestCallback by useLatest(callback)

    useEffectOnce {
        cleanup(latestCallback)
    }
}
