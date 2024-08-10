package react

import kotlinx.coroutines.CoroutineScope
import react.internal.isolatedPromise
import react.raw.useActionStateRaw

fun <S> useActionState(
    initialState: S,
    permalink: String? = undefined,
    action: suspend CoroutineScope.(state: S) -> S,
): ActionStateInstance1<S> =
    useActionStateRaw(
        action = { state ->
            isolatedPromise { action(state) }
        },
        initialState = initialState,
        permalink = permalink,
    )

fun <S, P> useActionState(
    initialState: S,
    permalink: String? = undefined,
    action: suspend CoroutineScope.(state: S, payload: P) -> S,
): ActionStateInstance2<S, P> =
    useActionStateRaw(
        action = { state, payload ->
            isolatedPromise { action(state, payload) }
        },
        initialState = initialState,
        permalink = permalink,
    )
