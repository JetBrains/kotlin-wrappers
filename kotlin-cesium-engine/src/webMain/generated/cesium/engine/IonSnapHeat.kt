// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * How close a snap result is to the cursor, reported by [IonSnapService.snap]
 * as [IonSnapService.Result] `heat`. Values match the iTwin.js
 * [SnapHeat](https://www.itwinjs.org/reference/core-frontend/locatingelements/snapheat/) enum.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IonSnapHeat">Online Documentation</a>
 */
sealed /* enum */
external interface IonSnapHeat {
    companion object {

        /**
         * The snap is not close to the cursor.
         *
         * Value - `0`
         */
        val NONE: IonSnapHeat

        /**
         * The snap is of interest, but outside the snap aperture.
         *
         * Value - `1`
         */
        val NOT_IN_RANGE: IonSnapHeat

        /**
         * The snap point is within the snap aperture of the close point in view space.
         *
         * Value - `2`
         */
        val IN_RANGE: IonSnapHeat
    }
}
