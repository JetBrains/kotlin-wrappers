// Automatically generated - do not modify!

package web.html

import web.events.Event
import web.events.EventInstance
import web.events.JsEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement)
 */
open external class HTMLDialogElement
protected constructor() :
    HTMLElement {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open)
     */
    var open: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue)
     */
    var returnValue: String

    /**
     * Closes the dialog element.
     *
     * The argument, if provided, provides a return value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close)
     */
    fun close(returnValue: String = definedExternally)

    /**
     * Displays the dialog element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/show)
     */
    fun show()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/showModal)
     */
    fun showModal()

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/cancel_event)
     */
    @JsEvent("cancel")
    val cancelEvent: EventInstance<Event, HTMLDialogElement /* this */, HTMLDialogElement /* this */>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/close_event)
     */
    @JsEvent("close")
    val closeEvent: EventInstance<Event, HTMLDialogElement /* this */, HTMLDialogElement /* this */>
}
