// Automatically generated - do not modify!

package web.html

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement) */
abstract external class HTMLDialogElement :
    HTMLElement {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/open) */
    var open: Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/returnValue) */
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

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLDialogElement/showModal) */
    fun showModal()
}
