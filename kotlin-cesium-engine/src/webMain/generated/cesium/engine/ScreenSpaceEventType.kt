// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * This enumerated type is for classifying mouse events: down, up, click, double click, move and move while a button is held down.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ScreenSpaceEventType">Online Documentation</a>
 */
sealed /* enum */
external interface ScreenSpaceEventType {
    companion object {

        /**
         * Represents a mouse left button down event.
         *
         * Value - `0`
         */
        val LEFT_DOWN: ScreenSpaceEventType

        /**
         * Represents a mouse left button up event.
         *
         * Value - `1`
         */
        val LEFT_UP: ScreenSpaceEventType

        /**
         * Represents a mouse left click event.
         *
         * Value - `2`
         */
        val LEFT_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse left double click event.
         *
         * Value - `3`
         */
        val LEFT_DOUBLE_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse left button down event.
         *
         * Value - `5`
         */
        val RIGHT_DOWN: ScreenSpaceEventType

        /**
         * Represents a mouse right button up event.
         *
         * Value - `6`
         */
        val RIGHT_UP: ScreenSpaceEventType

        /**
         * Represents a mouse right click event.
         *
         * Value - `7`
         */
        val RIGHT_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse middle button down event.
         *
         * Value - `10`
         */
        val MIDDLE_DOWN: ScreenSpaceEventType

        /**
         * Represents a mouse middle button up event.
         *
         * Value - `11`
         */
        val MIDDLE_UP: ScreenSpaceEventType

        /**
         * Represents a mouse middle click event.
         *
         * Value - `12`
         */
        val MIDDLE_CLICK: ScreenSpaceEventType

        /**
         * Represents a mouse move event.
         *
         * Value - `15`
         */
        val MOUSE_MOVE: ScreenSpaceEventType

        /**
         * Represents a mouse wheel event.
         *
         * Value - `16`
         */
        val WHEEL: ScreenSpaceEventType

        /**
         * Represents the start of a two-finger event on a touch surface.
         *
         * Value - `17`
         */
        val PINCH_START: ScreenSpaceEventType

        /**
         * Represents the end of a two-finger event on a touch surface.
         *
         * Value - `18`
         */
        val PINCH_END: ScreenSpaceEventType

        /**
         * Represents a change of a two-finger event on a touch surface.
         *
         * Value - `19`
         */
        val PINCH_MOVE: ScreenSpaceEventType
    }
}
