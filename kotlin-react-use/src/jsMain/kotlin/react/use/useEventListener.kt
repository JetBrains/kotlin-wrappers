package react.use

import js.coroutines.awaitCancellation
import js.objects.unsafeJso
import react.useEffect
import web.events.*

/**
 * [Original](https://usehooks-ts.com/react-hook/use-event-listener)
 */
fun <E : Event> useEventListener(
    target: EventTarget?,
    type: EventType<E>,
    options: AddEventListenerOptions = unsafeJso(),
    handler: (E) -> Unit,
) {
    val latestHandler by useLatest(handler)

    useEffect(target, type) {
        target ?: return@useEffect

        awaitCancellation(
            target.addEventHandler(
                type = type,
                options = options,
                handler = { latestHandler(it) },
            )
        )
    }
}
