// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Constants for identifying well-known tracking reference frames.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#TrackingReferenceFrame">Online Documentation</a>
 */
sealed /* enum */
external interface TrackingReferenceFrame {
    companion object {

        /**
         * Auto-detect algorithm. The reference frame used to track the Entity will
         * be automatically selected based on its trajectory: near-surface slow moving
         * objects will be tracked in the entity's local east-north-up reference
         * frame, while faster objects like satellites will use VVLH (Vehicle Velocity,
         * Local Horizontal).
         */
        val AUTODETECT: TrackingReferenceFrame

        /**
         * The entity's local East-North-Up reference frame.
         */
        val ENU: TrackingReferenceFrame

        /**
         * The entity's inertial reference frame. If entity has no defined orientation
         * property, it falls back to auto-detect algorithm.
         */
        val INERTIAL: TrackingReferenceFrame

        /**
         * The entity's inertial reference frame with orientation fixed to its
         * [VelocityOrientationProperty], ignoring its own orientation.
         */
        val VELOCITY: TrackingReferenceFrame
    }
}
