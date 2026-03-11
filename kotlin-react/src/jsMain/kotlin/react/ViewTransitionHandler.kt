package react

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import kotlinx.coroutines.CoroutineScope
import react.canary.ReactCanary
import react.internal.createCleanupCallback
import react.raw.ViewTransitionHandlerRaw

@ReactCanary
sealed /* final */
external interface ViewTransitionHandler

@ReactCanary
private fun ViewTransitionHandler(
    value: ViewTransitionHandlerRaw,
): ViewTransitionHandler =
    unsafeCast(value)

@ReactCanary
fun ViewTransitionHandler(
    block: suspend CoroutineScope.(
        instance: ViewTransitionInstance,
        types: ReadonlyArray<ViewTransitionType>,
    ) -> Unit,
): ViewTransitionHandler =
    ViewTransitionHandler(value = createCleanupCallback(block))
