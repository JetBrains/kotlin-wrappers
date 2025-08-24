package react

import js.function.async
import kotlinx.coroutines.CoroutineScope
import react.raw.useActionStateRaw

/**
 * [Online Documentation](https://react.dev/reference/react/useActionState)
 */
fun <S> useActionState(
    initialState: S,
    permalink: String? = undefined,
    action: suspend CoroutineScope.(state: S) -> S,
): ActionStateInstance1<S> =
    useActionStateRaw(
        action = async { state ->
            action(state)
        },
        initialState = initialState,
        permalink = permalink,
    )

/**
 * [Online Documentation](https://react.dev/reference/react/useActionState)
 */
fun <S, P> useActionState(
    initialState: S,
    permalink: String? = undefined,
    action: suspend CoroutineScope.(state: S, payload: P) -> S,
): ActionStateInstance2<S, P> =
    useActionStateRaw(
        action = async { state, payload ->
            action(state, payload)
        },
        initialState = initialState,
        permalink = permalink,
    )
