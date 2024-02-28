// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.events

inline fun <D> CustomEvent(
    type: EventType<CustomEvent<D, EventTarget>>,
): CustomEvent<D, *> =
    CustomEvent<D, EventTarget?>(
        type = type,
    )

inline fun <D> CustomEvent(
    type: EventType<CustomEvent<D, EventTarget>>,
    init: CustomEventInit<D>,
): CustomEvent<D, *> =
    CustomEvent<D, EventTarget?>(
        type = type,
        init = init,
    )
