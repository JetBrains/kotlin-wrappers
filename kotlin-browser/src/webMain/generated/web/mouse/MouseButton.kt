// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mouse

import seskar.js.JsRawValue

sealed external interface MouseButton {
    companion object {
        /**
         * Main button pressed, usually the left button or the un-initialized state
         */
        @JsRawValue("0")
        val MAIN: MouseButton

        /**
         * Auxiliary button pressed, usually the wheel button or the middle button (if present)
         */
        @JsRawValue("1")
        val AUXILIARY: MouseButton

        /**
         * Secondary button pressed, usually the right button
         */
        @JsRawValue("2")
        val SECONDARY: MouseButton

        /**
         * Fourth button, typically the Browser Back button
         */
        @JsRawValue("3")
        val FOURTH: MouseButton

        /**
         * Fifth button, typically the Browser Forward button
         */
        @JsRawValue("4")
        val FIFTH: MouseButton
    }
}
