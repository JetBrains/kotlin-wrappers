// Automatically generated - do not modify!

package web.html

import js.core.ArrayLike
import js.core.JsIterable
import web.dom.Element

abstract external class HTMLFormElement :
    HTMLElement,
    ArrayLike<Element>,
    JsIterable<Element> {
    /** Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form. */
    var acceptCharset: String

    /** Sets or retrieves the URL to which the form content is sent for processing. */
    var action: String

    /** Specifies whether autocomplete is applied to an editable text field. */
    var autocomplete: String

    /** Retrieves a collection, in source order, of all controls in a given form. */
    val elements: HTMLFormControlsCollection

    /** Sets or retrieves the MIME encoding for the form. */
    var encoding: String

    /** Sets or retrieves the encoding type for the form. */
    var enctype: String

    /** Sets or retrieves how to send the form data to the server. */
    var method: String

    /** Sets or retrieves the name of the object. */
    var name: String

    /** Designates a form that is not validated when submitted. */
    var noValidate: Boolean

    /** Sets or retrieves the window or frame at which to target content. */
    var target: String

    /** Returns whether a form will validate when it is submitted, without having to submit it. */
    fun checkValidity(): Boolean
    fun reportValidity(): Boolean
    fun requestSubmit(submitter: HTMLElement? = definedExternally)

    /** Fires when the user resets a form. */
    fun reset()

    /** Fires when a FORM is about to be submitted. */
    fun submit()
    // [name: string]: any
}
