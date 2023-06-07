package react.use

import react.Ref
import react.RefCallback
import react.setRef
import react.useMemo

/**
 * [Original](https://github.com/mui/material-ui/blob/37f3909a187d64d0e768f81b7f00632b2743bd09/packages/mui-utils/src/useForkRef.ts#L4)
 */
fun <T : Any> useForkRef(
    refA: Ref<T>?,
    refB: Ref<T>?,
): Ref<T>? =
    useMemo(refA, refB) {
        if (refA == null && refB == null)
            return@useMemo null

        RefCallback { value ->
            setRef(refA, value)
            setRef(refB, value)
        }
    }
