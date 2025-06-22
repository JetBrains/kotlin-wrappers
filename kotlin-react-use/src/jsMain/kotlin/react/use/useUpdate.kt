package react.use

import js.array.component1
import js.array.component2
import js.core.Void
import js.reflect.unsafeCast
import react.useReducer

private val updateReducer: (Int, Void) -> Int = { num, _ ->
    (num + 1) % 1_000_000
}

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useUpdate.ts)
 */
fun useUpdate(): () -> Unit {
    val (_, update) = useReducer(updateReducer, 0)

    return unsafeCast(update)
}
