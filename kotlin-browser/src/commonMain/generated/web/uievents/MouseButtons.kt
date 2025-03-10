// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.uievents

import js.core.Bitmask
import seskar.js.JsRawValue

sealed external interface MouseButtons :
    Bitmask<MouseButtons> {
    companion object {
        /**
         * No button or un-initialized
         */
        @JsRawValue("0")
        val NONE: MouseButtons

        /**
         * Primary button (usually the left button)
         */
        @JsRawValue("1")
        val PRIMARY: MouseButtons

        /**
         * Secondary button (usually the right button)
         */
        @JsRawValue("2")
        val SECONDARY: MouseButtons

        /**
         * Auxiliary button (usually the mouse wheel button or middle button)
         */
        @JsRawValue("4")
        val AUXILIARY: MouseButtons

        /**
         * 4th button (typically the "Browser Back" button)
         */
        @JsRawValue("8")
        val FOURTH: MouseButtons

        /**
         * 5th button (typically the "Browser Forward" button)
         */
        @JsRawValue("16")
        val FIFTH: MouseButtons
    }
}
