@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.events

external interface CustomEventInit<T> : EventInit {
    var detail: T
}

external class CustomEvent<T>(
    override val type: EventType<CustomEvent<T>>,
    init: CustomEventInit<T> = definedExternally,
) : Event {
    val detail: T
}
