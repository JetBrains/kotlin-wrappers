// Automatically generated - do not modify!

package testing.library.user.event.system.keyboard

// unhandled import: Instance from "../setup"
// unhandled import: System from "."

external interface keyboardKey {
    /** Physical location on a keyboard */
    var code: String?

    /** Character or functional key descriptor */
    var key: String?

    /** Location on the keyboard for keys with multiple representation */
    var location: DOM_KEY_LOCATION?

    /** Does the character in `key` require/imply AltRight to be pressed? */
    var altGr: Boolean?

    /** Does the character in `key` require/imply a shiftKey to be pressed? */
    var shift: Boolean?
}
