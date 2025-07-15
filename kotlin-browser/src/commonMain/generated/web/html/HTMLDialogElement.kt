// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance
import kotlin.js.definedExternally

/**
 * The **`HTMLDialogElement`** interface provides methods to manipulate dialog elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement)
 */
open external class HTMLDialogElement
protected constructor() :
    HTMLElement {
    /**
     * The **`closedBy`** property of the A string; possible values are: - `any` - : The dialog can be dismissed with a light dismiss user action, a platform-specific user action, or a developer-specified mechanism.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/closedBy)
     */
    var closedBy: String

    /**
     * The **`open`** property of the `open` HTML attribute, indicating whether the dialog is available for interaction.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open)
     */
    var open: Boolean

    /**
     * The **`returnValue`** property of the HTMLDialogElement interface is a string representing the return value for a dialog element when it's closed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue)
     */
    var returnValue: String

    /**
     * The **`close()`** method of the HTMLDialogElement interface closes the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close)
     */
    fun close(returnValue: String = definedExternally)

    /**
     * The **`requestClose()`** method of the HTMLDialogElement interface requests to close the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/requestClose)
     */
    fun requestClose(returnValue: String = definedExternally)

    /**
     * The **`show()`** method of the HTMLDialogElement interface displays the dialog modelessly, i.e., still allowing interaction with content outside of the dialog.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/show)
     */
    fun show()

    /**
     * The **`showModal()`** method of the of any other dialogs that might be present.
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
