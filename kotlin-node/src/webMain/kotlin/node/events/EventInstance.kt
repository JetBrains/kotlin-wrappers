package node.events

import js.array.Tuple
import js.array.Tuple1
import js.array.asArray
import js.function.JsFunction
import js.function.invoke
import js.iterable.asFlow
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

private val toNodeListener = JsFunction<Tuple1<Function<Unit>>, EventListener>(
    parameterNames = arrayOf("handler"),
    // language=javascript
    body = "return (...args) => { handler(args) }",
)

class EventInstance<out P : Tuple>(
    internal val emitter: EventEmitter,
    internal val type: EventType,
) : Flow<P> {
    fun addHandler(
        handler: (P) -> Unit,
    ): () -> Unit {
        val listener = toNodeListener(handler)

        emitter.on(
            type = type,
            listener = listener,
        )

        return {
            emitter.off(
                type = type,
                listener = listener,
            )
        }
    }

    override suspend fun collect(
        collector: FlowCollector<P>,
    ) {
        EventEmitter.on<P>(emitter, type)
            .asFlow()
            .collect(collector)
    }

    fun emit(
        payload: @UnsafeVariance P,
    ) {
        emitter.emit(
            type = type,
            args = payload.asArray(),
        )
    }
}
