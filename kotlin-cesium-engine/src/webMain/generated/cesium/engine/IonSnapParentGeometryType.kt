// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The type of the parent geometry a snap resolved to, reported by
 * [IonSnapService.snap] as [IonSnapService.Result] `parentGeometryType`.
 * Values match the iTwin.js
 * [HitParentGeomType](https://www.itwinjs.org/reference/core-frontend/locatingelements/hitparentgeomtype/) enum.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IonSnapParentGeometryType">Online Documentation</a>
 */
sealed /* enum */
external interface IonSnapParentGeometryType {
    companion object {

        /**
         * No parent geometry type.
         *
         * Value - `0`
         */
        val NONE: IonSnapParentGeometryType

        /**
         * A wire body.
         *
         * Value - `1`
         */
        val WIRE: IonSnapParentGeometryType

        /**
         * A sheet body.
         *
         * Value - `2`
         */
        val SHEET: IonSnapParentGeometryType

        /**
         * A solid body.
         *
         * Value - `3`
         */
        val SOLID: IonSnapParentGeometryType

        /**
         * A mesh.
         *
         * Value - `4`
         */
        val MESH: IonSnapParentGeometryType

        /**
         * Text.
         *
         * Value - `5`
         */
        val TEXT: IonSnapParentGeometryType
    }
}
