package example.query

import js.coroutines.promise
import kotlinx.coroutines.CoroutineScope
import tanstack.query.core.MutationFunction
import kotlin.coroutines.EmptyCoroutineContext

fun <D, V> createMutationFunction(
    action: suspend (V) -> D,
): MutationFunction<D, V> =
    { variables ->
        CoroutineScope(EmptyCoroutineContext)
            .promise { action(variables) }
    }
