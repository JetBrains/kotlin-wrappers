package react

import js.function.unsafeAsync
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
        action = unsafeAsync(action),
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
        action = unsafeAsync(action),
        initialState = initialState,
        permalink = permalink,
    )
