package web.events

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
