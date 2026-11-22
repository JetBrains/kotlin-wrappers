@file:Suppress(
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.events

import js.internal.InternalApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
 */
@SubclassOptInRequired(InternalApi::class)
external interface EventTargetLike {
    internal /* hidden */
    fun <E : Event> addEventListener(
        type: EventType<E>,
        callback: EventHandler<E, *, *>,
        options: AddEventListenerOptions? = definedExternally,
    ): Unit = definedExternally

    internal /* hidden */
    fun <E : Event> addEventListener(
        type: EventType<*>,
        callback: (E) -> Unit,
        options: AddEventListenerOptions? = definedExternally,
    ): Unit = definedExternally

    /**
     * The **`dispatchEvent()`** method of the EventTarget sends an Event to the object, (synchronously) invoking the affected event listeners in the appropriate order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
     */
    fun dispatchEvent(
        event: Event,
    ): Boolean
}
