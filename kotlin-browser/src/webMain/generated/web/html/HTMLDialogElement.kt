// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance
import kotlin.js.definedExternally

/**
 * The **`HTMLDialogElement`** interface provides methods to manipulate <dialog> elements. It inherits properties and methods from the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement)
 */
open external class HTMLDialogElement
protected constructor() :
    HTMLElement {
    /**
     * The **`closedBy`** property of the HTMLDialogElement interface indicates the types of user actions that can be used to close the associated <dialog> element. It sets or returns the dialog's closedby attribute value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy)
     */
    var closedBy: ClosedBy

    /**
     * The **`open`** property of the HTMLDialogElement interface is a boolean value reflecting the open HTML attribute, indicating whether the <dialog> is available for interaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open)
     */
    var open: Boolean

    /**
     * The **`returnValue`** property of the HTMLDialogElement interface is a string representing the return value for a <dialog> element when it's closed. You can set the value directly (dialog.returnValue = "result") or by providing the value as a string argument to close() or requestClose().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue)
     */
    var returnValue: String

    /**
     * The **`close()`** method of the HTMLDialogElement interface closes the <dialog>. An optional string may be passed as an argument, updating the returnValue of the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close)
     */
    fun close(returnValue: String = definedExternally)

    /**
     * The **`requestClose()`** method of the HTMLDialogElement interface requests to close the <dialog>. An optional string may be passed as an argument, updating the returnValue of the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/requestClose)
     */
    fun requestClose(returnValue: String = definedExternally)

    /**
     * The **`show()`** method of the HTMLDialogElement interface displays the dialog as a non-modal dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/show)
     */
    fun show()

    /**
     * The **`showModal()`** method of the HTMLDialogElement interface displays the dialog as a modal dialog, over the top of any other dialogs or elements that might be visible.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/showModal)
     */
    fun showModal()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/cancel_event)
 */
inline val <C : HTMLDialogElement> C.cancelEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "cancel")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close_event)
 */
inline val <C : HTMLDialogElement> C.closeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "close")
