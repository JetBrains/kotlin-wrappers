package react.use

import react.useEffectOnceWithCleanup

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useUnmount.ts)
 */
fun useUnmountEffect(
    callback: () -> Unit,
) {
    val latestCallback by useLatest(callback)

    useEffectOnceWithCleanup {
        onCleanup(latestCallback)
    }
}
