package web.events

external interface CustomEventInit<T> : EventInit {
    var detail: T
}

external class CustomEvent<T>(
    type: EventType<CustomEvent<T>>,
    init: CustomEventInit<T> = definedExternally,
) : Event {
    val detail: T
}
