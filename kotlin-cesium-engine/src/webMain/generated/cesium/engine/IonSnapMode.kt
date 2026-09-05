// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The snap modes supported by [IonSnapService.snap]. These follow the
 * MicroStation snap mode semantics; see the
 * [MicroStation documentation](https://docs.bentley.com/LiveContent/web/MicroStation%20Help-v27/en/GUID-77D54C0B-D6FF-13DA-5EC8-3196330F5244.html)
 * for reference.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IonSnapMode">Online Documentation</a>
 */
sealed /* enum */
external interface IonSnapMode {
    companion object {

        /**
         * Snaps to the point on the element nearest to the cursor. When the cursor
         * is farther than the snap aperture from an edge, tracks the surface under
         * the cursor instead.
         *
         * Value - `1`
         */
        val NEAREST: IonSnapMode

        /**
         * Snaps to the nearest of the element's keypoints. Keypoints are defined by
         * the element's geometry type and the snap divisor.
         *
         * On linear elements, keypoints are regularly spaced along each segment:
         * the number of keypoints on a segment is one greater than the snap
         * divisor, and a segment's midpoint is a keypoint only when the divisor is
         * even. The ion API does not currently accept a snap divisor, so the
         * server's default divisor applies.
         *
         * Value - `2`
         */
        val NEAREST_KEYPOINT: IonSnapMode

        /**
         * Snaps to the center of elements that have centers (such as circles and
         * arcs). For other elements, may snap to the centroid.
         *
         * Value - `8`
         */
        val CENTER: IonSnapMode
    }
}
