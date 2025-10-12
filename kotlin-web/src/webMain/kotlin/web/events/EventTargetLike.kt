@file:Suppress(
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.events

import js.internal.InternalApi
import kotlin.js.definedExternally
import kotlin.js.undefined

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

    internal /* hidden */
    fun <E : Event> removeEventListener(
        type: EventType<E>,
        callback: EventHandler<E, *, *>,
        options: EventListenerOptions? = definedExternally,
    ): Unit = definedExternally

    internal /* hidden */
    fun <E : Event> removeEventListener(
        type: EventType<*>,
        callback: (E) -> Unit,
        options: EventListenerOptions? = definedExternally,
    ): Unit = definedExternally

    /**
     * The **`dispatchEvent()`** method of the EventTarget sends an Event to the object, (synchronously) invoking the affected event listeners in the appropriate order.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
     */
    fun dispatchEvent(
        event: Event,
    ): Boolean = definedExternally
}

// event

/**
 * The **`addEventListener()`** method of the EventTarget interface sets up a function that will be called whenever the specified event is delivered to the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
 */
fun <E : Event> EventTargetLike.addEventListener(
    type: EventType<E>,
    handler: (E) -> Unit,
    options: AddEventListenerOptions? = undefined,
) {
    addEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}

/**
 * The **`removeEventListener()`** method of the EventTarget interface removes an event listener previously registered with EventTarget.addEventListener() from the target.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
 */
fun <E : Event> EventTargetLike.removeEventListener(
    type: EventType<E>,
    handler: (E) -> Unit,
    options: EventListenerOptions? = undefined,
) {
    removeEventListener(
        type = type,
        callback = handler,
        options = options,
    )
}
