package react.use

import react.useEffect
import web.events.*

/**
 * [Original](https://usehooks-ts.com/react-hook/use-event-listener)
 */
fun <T : Event<EventTarget>> useEventListener(
    target: EventTarget?,
    type: EventType<T>,
    options: AddEventListenerOptions? = undefined,
    handler: EventHandler<T>,
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
