package react.use

import react.useEffect
import web.events.*

/**
 * [Original](https://usehooks-ts.com/react-hook/use-event-listener)
 */
fun <E : Event> useEventListener(
    target: EventTarget?,
    type: EventType<E>,
    options: AddEventListenerOptions? = undefined,
    handler: (E) -> Unit,
) {
    val latestHandler by useLatest(handler)

    useEffect(target, type) {
        target ?: return@useEffect

        awaitCleanup(
            target.addEventHandler(
                type = type,
                options = options,
                handler = { latestHandler(it) },
            )
        )
    }
}
