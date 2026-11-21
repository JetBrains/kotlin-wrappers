// Automatically generated - do not modify!

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

    /**
     * The **`popoverTargetElement`** property of the HTMLButtonElement interface gets and sets the popover element to control via a button.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetElement)
     */
    var popoverTargetElement: Element?
}
