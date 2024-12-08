package react

import js.array.JsTuple2
import js.array.tupleOf
import kotlinx.coroutines.job

// [Example](https://popper.js.org/react-popper/v2/#example)

fun <T : Any> useRefState(): JsTuple2<T?, RefCallback<T>> {
    var state by useState<T>()
    val callback = RefCallback<T> { value ->
        state = value

        // cleanup
        coroutineContext.job.invokeOnCompletion {
            state = null
        }
    }

    return tupleOf(state, callback)
}
