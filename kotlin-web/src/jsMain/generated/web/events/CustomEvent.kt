// Automatically generated - do not modify!

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
    "INVISIBLE_MEMBER",
    "INVISIBLE_REFERENCE",
)

package web.events

import kotlin.internal.LowPriorityInOverloadResolution

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent)
 */
open external class CustomEvent<out D, out C : EventTarget?>
@LowPriorityInOverloadResolution
constructor(
    override val type: EventType<CustomEvent<D, *>>,
    init: CustomEventInit<D> = definedExternally,
) : Event<C>,
    CustomEventInit<D> {
    /**
     * Returns any custom data event was created with. Typically used for synthetic events.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CustomEvent/detail)
     */
    override val detail: D

    companion object
}
