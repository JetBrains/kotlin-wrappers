package react.internal

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import react.Cleanup
import react.EffectBuilder
import kotlin.coroutines.EmptyCoroutineContext

internal fun createEffectCallback(
    effect: suspend EffectBuilder.() -> Unit,
): () -> Cleanup? = callback@{
    val scope = CoroutineScope(EmptyCoroutineContext)
    val cleanups = arrayOf<Cleanup>()

    val job = scope.launch {
        effect(cleanups.unsafeCast<EffectBuilder>())
    }

    return@callback {
        job.cancel()

        for (cleanup in cleanups) {
            cleanup()
        }
    }
}
