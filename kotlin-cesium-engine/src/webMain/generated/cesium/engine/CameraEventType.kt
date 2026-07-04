// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Enumerates the available input for interacting with the camera.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#CameraEventType">Online Documentation</a>
 */
sealed /* enum */
external interface CameraEventType {
    companion object {

        /**
         * A left mouse button press followed by moving the mouse and releasing the button.
         *
         * Value - `0`
         */
        val LEFT_DRAG: CameraEventType

        /**
         * A right mouse button press followed by moving the mouse and releasing the button.
         *
         * Value - `1`
         */
        val RIGHT_DRAG: CameraEventType

        /**
         * A middle mouse button press followed by moving the mouse and releasing the button.
         *
         * Value - `2`
         */
        val MIDDLE_DRAG: CameraEventType

        /**
         * Scrolling the middle mouse button.
         *
         * Value - `3`
         */
        val WHEEL: CameraEventType

        /**
         * A two-finger touch on a touch surface.
         *
         * Value - `4`
         */
        val PINCH: CameraEventType
    }
}
