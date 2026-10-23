// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Whether a classification affects terrain, 3D Tiles or both.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ClassificationType">Online Documentation</a>
 */
/* enum */
external class ClassificationType
private constructor() {
    companion object {

        /**
         * Only terrain will be classified.
         *
         * Value - `0`
         */
        val TERRAIN: ClassificationType

        /**
         * Only 3D Tiles will be classified.
         *
         * Value - `1`
         */
        val CESIUM_3D_TILE: ClassificationType

        /**
         * Both terrain and 3D Tiles will be classified.
         *
         * Value - `2`
         */
        val BOTH: ClassificationType
    }
}
