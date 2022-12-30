// Automatically generated - do not modify!

package web.html

abstract external class HTMLDialogElement :
    HTMLElement {
    var open: Boolean
    var returnValue: String

    /**
     * Closes the dialog element.
     *
     * The argument, if provided, provides a return value.
     */
    fun close(returnValue: String = definedExternally)

    /** Displays the dialog element. */
    fun show()
    fun showModal()
}
