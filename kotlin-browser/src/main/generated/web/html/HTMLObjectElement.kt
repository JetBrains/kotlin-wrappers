// Automatically generated - do not modify!

package web.html

import dom.Document
import web.window.WindowProxy

abstract external class HTMLObjectElement :
    HTMLElement {
    /** Retrieves the document object of the page or frame. */
    val contentDocument: Document?
    val contentWindow: WindowProxy?

    /** Sets or retrieves the URL that references the data of the object. */
    var data: String

    /** Retrieves a reference to the form that the object is embedded in. */
    val form: HTMLFormElement?

    /** Sets or retrieves the height of the object. */
    var height: String

    /** Sets or retrieves the name of the object. */
    var name: String

    /** Sets or retrieves the MIME type of the object. */
    var type: String

    /** Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map. */
    var useMap: String

    /** Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting. */
    val validationMessage: String

    /** Returns a  ValidityState object that represents the validity states of an element. */
    val validity: ValidityState

    /** Sets or retrieves the width of the object. */
    var width: String

    /** Returns whether an element will successfully validate based on forms validation rules and constraints. */
    val willValidate: Boolean

    /** Returns whether a form will validate when it is submitted, without having to submit it. */
    fun checkValidity(): Boolean
    fun getSVGDocument(): Document?
    fun reportValidity(): Boolean

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     * @param error Sets a custom error message that is displayed when a form is submitted.
     */
    fun setCustomValidity(error: String)
}
