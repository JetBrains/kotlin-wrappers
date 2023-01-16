package react.use

import react.useRefValue

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useFirstMountState.ts)
 */
fun useIsFirstRender(): Boolean {
    var isFirst by useRefValue(true)

    if (isFirst) {
        isFirst = false

        return true
    }

    return isFirst
}
