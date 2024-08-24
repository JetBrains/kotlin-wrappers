package react.use

import react.useEffectWithCleanup
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

    useEffectWithCleanup(target, type) {
        target ?: return@useEffectWithCleanup

        onCleanup(
            target.addEventHandler(
                type = type,
                options = options,
                handler = { latestHandler(it) },
            )
        )
    }
}
