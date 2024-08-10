// Automatically generated - do not modify!

package web.uievents

import js.core.Bitmask
import seskar.js.JsIntValue

sealed external interface MouseButtons :
    Bitmask<MouseButtons> {
    companion object {
        /**
         * No button or un-initialized
         */
        @JsIntValue(0)
        val NONE: MouseButtons

        /**
         * Primary button (usually the left button)
         */
        @JsIntValue(1)
        val PRIMARY: MouseButtons

        /**
         * Secondary button (usually the right button)
         */
        @JsIntValue(2)
        val SECONDARY: MouseButtons

        /**
         * Auxiliary button (usually the mouse wheel button or middle button)
         */
        @JsIntValue(4)
        val AUXILIARY: MouseButtons

        /**
         * 4th button (typically the "Browser Back" button)
         */
        @JsIntValue(8)
        val FOURTH: MouseButtons

        /**
         * 5th button (typically the "Browser Forward" button)
         */
        @JsIntValue(16)
        val FIFTH: MouseButtons
    }
}
