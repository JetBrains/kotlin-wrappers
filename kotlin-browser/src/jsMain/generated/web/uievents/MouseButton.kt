// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.uievents

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MouseButton {
    companion object {
        /**
         * Main button pressed, usually the left button or the un-initialized state
         */
        @JsIntValue(0)
        val MAIN: MouseButton

        /**
         * Auxiliary button pressed, usually the wheel button or the middle button (if present)
         */
        @JsIntValue(1)
        val AUXILIARY: MouseButton

        /**
         * Secondary button pressed, usually the right button
         */
        @JsIntValue(2)
        val SECONDARY: MouseButton

        /**
         * Fourth button, typically the Browser Back button
         */
        @JsIntValue(3)
        val FOURTH: MouseButton

        /**
         * Fifth button, typically the Browser Forward button
         */
        @JsIntValue(4)
        val FIFTH: MouseButton
    }
}
