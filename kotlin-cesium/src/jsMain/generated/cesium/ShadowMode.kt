// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Specifies whether the object casts or receives shadows from light sources when
 * shadows are enabled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ShadowMode">Online Documentation</a>
 */
sealed external interface ShadowMode {
    companion object {

        /**
         * The object does not cast or receive shadows.
         */
        val DISABLED: ShadowMode

        /**
         * The object casts and receives shadows.
         */
        val ENABLED: ShadowMode

        /**
         * The object casts shadows only.
         */
        val CAST_ONLY: ShadowMode

        /**
         * The object receives shadows only.
         */
        val RECEIVE_ONLY: ShadowMode
    }
}
