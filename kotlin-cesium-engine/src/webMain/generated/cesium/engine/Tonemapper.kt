// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * A tonemapping algorithm when rendering with high dynamic range.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#Tonemapper">Online Documentation</a>
 */
sealed /* enum */
external interface Tonemapper {
    companion object {

        /**
         * Use the Reinhard tonemapping.
         *
         * Value - `"REINHARD"`
         */
        val REINHARD: Tonemapper

        /**
         * Use the modified Reinhard tonemapping.
         *
         * Value - `"MODIFIED_REINHARD"`
         */
        val MODIFIED_REINHARD: Tonemapper

        /**
         * Use the Filmic tonemapping.
         *
         * Value - `"FILMIC"`
         */
        val FILMIC: Tonemapper

        /**
         * Use the ACES tonemapping.
         *
         * Value - `"ACES"`
         */
        val ACES: Tonemapper

        /**
         * Use the PBR Neutral tonemapping [from Khronos](https://github.com/KhronosGroup/ToneMapping/tree/main/PBR_Neutral).
         *
         * Value - `"PBR_NEUTRAL"`
         */
        val PBR_NEUTRAL: Tonemapper
    }
}
