// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.popover

import js.internal.InternalApi
import web.dom.Element

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface PopoverTargetAttributes {
    /**
     * The **`popoverTargetAction`** property of the HTMLButtonElement interface gets and sets the action to be performed ("hide", "show", or "toggle") on a popover element being controlled by a button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetAction)
     */
    var popoverTargetAction: PopoverTargetAction
        get() = definedExternally
        set(value) = definedExternally

    /**
     * The **`popoverTargetElement`** property of the HTMLButtonElement interface gets and sets the popover element to control via a button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetElement)
     */
    var popoverTargetElement: Element?
        get() = definedExternally
        set(value) = definedExternally
}
