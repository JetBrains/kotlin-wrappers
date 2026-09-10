package react

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.raw.ViewTransitionHandlerRaw

sealed /* final */
external interface ViewTransitionHandler

private fun ViewTransitionHandler(
    value: ViewTransitionHandlerRaw,
): ViewTransitionHandler =
    unsafeCast(value)

fun ViewTransitionHandler(
    block: suspend CoroutineScope.(
        instance: ViewTransitionInstance,
        types: ReadonlyArray<ViewTransitionType>,
    ) -> Unit,
): ViewTransitionHandler =
    ViewTransitionHandler(value = createCleanupCallback(block))
