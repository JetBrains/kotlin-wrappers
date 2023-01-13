package react.use

import react.useRefValue

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useRendersCount.ts)
 */
fun useRendersCount(): Int {
    var count by useRefValue(0)
    count++
    return count
}
