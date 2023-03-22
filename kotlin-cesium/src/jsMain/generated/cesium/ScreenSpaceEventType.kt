// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * This enumerated type is for classifying mouse events: down, up, click, double click, move and move while a button is held down.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ScreenSpaceEventType">Online Documentation</a>
 */

sealed external interface ScreenSpaceEventType {
    companion object {

        /**
         * Represents a mouse left button down event.
         */
        val LEFT_DOWN: ScreenSpaceEventType

        /**
         * Represents a mouse left button up event.
         */
        val LEFT_UP: ScreenSpaceEventType

        /**
         * Represents a mouse left click event.
         */
        val LEFT_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse left double click event.
         */
        val LEFT_DOUBLE_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse left button down event.
         */
        val RIGHT_DOWN: ScreenSpaceEventType

        /**
         * Represents a mouse right button up event.
         */
        val RIGHT_UP: ScreenSpaceEventType

        /**
         * Represents a mouse right click event.
         */
        val RIGHT_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse middle button down event.
         */
        val MIDDLE_DOWN: ScreenSpaceEventType

        /**
         * Represents a mouse middle button up event.
         */
        val MIDDLE_UP: ScreenSpaceEventType

        /**
         * Represents a mouse middle click event.
         */
        val MIDDLE_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse move event.
         */
        val MOUSE_MOVE: ScreenSpaceEventType

        /**
         * Represents a mouse wheel event.
         */
        val WHEEL: ScreenSpaceEventType

        /**
         * Represents the start of a two-finger event on a touch surface.
         */
        val PINCH_START: ScreenSpaceEventType

        /**
         * Represents the end of a two-finger event on a touch surface.
         */
        val PINCH_END: ScreenSpaceEventType

        /**
         * Represents a change of a two-finger event on a touch surface.
         */
        val PINCH_MOVE: ScreenSpaceEventType
    }
}
