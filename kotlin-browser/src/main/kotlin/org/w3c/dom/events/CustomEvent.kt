package org.w3c.dom.events

import org.w3c.dom.EventInit
import web.events.EventType

external interface CustomEventInit<T> : EventInit {
    var detail: T
}

external class CustomEvent<T>(
    type: EventType<CustomEvent<T>>,
    eventInitDict: CustomEventInit<T> = definedExternally,
) : Event {
    constructor(
        type: String,
        eventInitDict: CustomEventInit<T> = definedExternally,
    )

    val detail: T
}
