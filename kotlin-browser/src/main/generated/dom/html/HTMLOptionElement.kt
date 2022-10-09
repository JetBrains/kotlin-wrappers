// Automatically generated - do not modify!

package dom.html

sealed external class HTMLOptionElement :
    HTMLElement {
    /** Sets or retrieves the status of an option. */
    var defaultSelected: Boolean
    var disabled: Boolean

    /** Retrieves a reference to the form that the object is embedded in. */
    val form: HTMLFormElement?

    /** Sets or retrieves the ordinal position of an option in a list box. */
    val index: Number

    /** Sets or retrieves a value that you can use to implement your own label functionality for the object. */
    var label: String

    /** Sets or retrieves whether the option in the list box is the default item. */
    var selected: Boolean

    /** Sets or retrieves the text string specified by the option tag. */
    var text: String

    /** Sets or retrieves the value which is returned to the server when the form control is submitted. */
    var value: String
}
