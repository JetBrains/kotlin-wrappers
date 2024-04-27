// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Constants used to indicated what part of the sensor volume to display.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#SensorVolumePortionToDisplay">Online Documentation</a>
 */
sealed external interface SensorVolumePortionToDisplay {
    companion object {

        /**
         * 0x0000.  Display the complete sensor volume.
         */
        val COMPLETE: SensorVolumePortionToDisplay

        /**
         * 0x0001.  Display the portion of the sensor volume that lies below the true horizon of the ellipsoid.
         */
        val BELOW_ELLIPSOID_HORIZON: SensorVolumePortionToDisplay

        /**
         * 0x0002.  Display the portion of the sensor volume that lies above the true horizon of the ellipsoid.
         */
        val ABOVE_ELLIPSOID_HORIZON: SensorVolumePortionToDisplay
    }
}
