// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The type of geometry a snap resolved to, reported by [IonSnapService.snap]
 * as [IonSnapService.Result] `geometryType`. Values match the iTwin.js
 * [HitGeomType](https://www.itwinjs.org/reference/core-frontend/locatingelements/hitgeomtype/) enum.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IonSnapGeometryType">Online Documentation</a>
 */
sealed /* enum */
external interface IonSnapGeometryType {
    companion object {

        /**
         * No geometry type.
         *
         * Value - `0`
         */
        val NONE: IonSnapGeometryType

        /**
         * A point.
         *
         * Value - `1`
         */
        val POINT: IonSnapGeometryType

        /**
         * A line segment.
         *
         * Value - `2`
         */
        val SEGMENT: IonSnapGeometryType

        /**
         * A curve.
         *
         * Value - `3`
         */
        val CURVE: IonSnapGeometryType

        /**
         * An arc.
         *
         * Value - `4`
         */
        val ARC: IonSnapGeometryType

        /**
         * A surface.
         *
         * With [IonSnapMode] `NEAREST`, this value indicates
         * the snap tracked the surface under the cursor because no edge was within
         * the snap aperture. This means the snap point was not pulled to an edge.
         * Edge snaps report one of the other types along with the edge geometry in
         * [IonSnapService.Result] `curve`, which is absent when
         * tracking a surface.
         *
         * Value - `5`
         */
        val SURFACE: IonSnapGeometryType
    }
}
