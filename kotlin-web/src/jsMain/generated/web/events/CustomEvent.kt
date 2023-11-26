// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.events

external interface CustomEventInit<T> : EventInit {
    var detail: T?
}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent) */
open external class CustomEvent<out T>(
    override val type: EventType<CustomEvent<T>>,
    init: CustomEventInit<T> = definedExternally,
) : Event {
    /**
     * Returns any custom data event was created with. Typically used for synthetic events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    val detail: T

    companion object
}
