package wrappers.example.query

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import tanstack.query.core.MutationFunction

fun <D, V> createMutationFunction(
    action: suspend (V) -> D,
): MutationFunction<D, V> =
    { variables ->
        IsolatedCoroutineScope()
            .promise { action(variables) }
    }
