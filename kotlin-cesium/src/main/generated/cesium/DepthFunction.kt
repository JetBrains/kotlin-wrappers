// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

package cesium

/**
 * Determines the function used to compare two depths for the depth test.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#DepthFunction">Online Documentation</a>
 */

external enum class DepthFunction {

    /**
     * The depth test never passes.
     */
    NEVER,

    /**
     * The depth test passes if the incoming depth is less than the stored depth.
     */
    LESS,

    /**
     * The depth test passes if the incoming depth is equal to the stored depth.
     */
    EQUAL,

    /**
     * The depth test passes if the incoming depth is less than or equal to the stored depth.
     */
    LESS_OR_EQUAL,

    /**
     * The depth test passes if the incoming depth is greater than the stored depth.
     */
    GREATER,

    /**
     * The depth test passes if the incoming depth is not equal to the stored depth.
     */
    NOT_EQUAL,

    /**
     * The depth test passes if the incoming depth is greater than or equal to the stored depth.
     */
    GREATER_OR_EQUAL,

    /**
     * The depth test always passes.
     */
    ALWAYS,

    ;

}
