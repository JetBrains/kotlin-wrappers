// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * A credit contains data pertaining to how to display attributions/credits for certain content on the screen.
 * ```
 * //Create a credit with a tooltip, image and link
 * const credit = new Credit('<a href="https://cesium.com/" target="_blank"><img src="/images/cesium_logo.png" title="Cesium"/></a>');
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Credit.html">Online Documentation</a>
 *
 * @constructor
 * @property [html] An string representing an html code snippet
 * @property [showOnScreen] If true, the credit will be visible in the main credit container.  Otherwise, it will appear in a popover
 *   Default value - `false`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Credit.html">Online Documentation</a>
 */
external class Credit(
    val html: String,
    var showOnScreen: Boolean = definedExternally,
) {
    /**
     * Gets the credit element
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Credit.html#element">Online Documentation</a>
     */
    val element: org.w3c.dom.HTMLElement

    companion object {
        /**
         * Returns true if the credits are equal
         * @param [left] The first credit
         * @param [right] The second credit
         * @return `true` if left and right are equal, `false` otherwise.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Credit.html#.equals">Online Documentation</a>
         */
        fun equals(
            left: Credit,
            right: Credit,
        ): Boolean

        /**
         * Duplicates a Credit instance.
         * @param [credit] The Credit to duplicate.
         * @return A new Credit instance that is a duplicate of the one provided. (Returns undefined if the credit is undefined)
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/Credit.html#.clone">Online Documentation</a>
         */
        fun clone(credit: Credit? = definedExternally): Credit
    }
}
