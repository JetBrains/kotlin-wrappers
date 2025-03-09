// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package web.html

import web.dom.Element
import web.popover.PopoverTargetAction

sealed external interface PopoverInvokerElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetAction)
     */
    var popoverTargetAction: PopoverTargetAction
        get() = definedExternally
        set(value) = definedExternally

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLButtonElement/popoverTargetElement)
     */
    var popoverTargetElement: Element?
        get() = definedExternally
        set(value) = definedExternally
}
