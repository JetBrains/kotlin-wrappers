package react.use

import react.useEffect
import web.events.*

/**
 * [Original](https://usehooks-ts.com/react-hook/use-event-listener)
 */
fun <E : Event, C : EventTarget> useEventListener(
    target: C?,
    type: EventType<E, C>,
    options: AddEventListenerOptions? = undefined,
    handler: EventHandler<E, C>,
) {
    val latestHandler by useLatest(handler)

    useEffect(target, type) {
        target ?: return@useEffect

        cleanup(
            target.addEventHandler(
                type = type,
                options = options,
                handler = { latestHandler(it) },
            )
        )
    }
}
