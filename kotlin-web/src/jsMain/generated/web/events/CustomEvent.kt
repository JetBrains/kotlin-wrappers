// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package web.events

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent)
 */
open external class CustomEvent<out T>(
    override val type: EventType<CustomEvent<T>>,
    init: CustomEventInit<T> = definedExternally,
) : Event,
    CustomEventInit<T> {
    /**
     * Returns any custom data event was created with. Typically used for synthetic events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    override val detail: T

    companion object
}
