// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * The credit display is responsible for displaying credits on screen.
 * ```
 * const creditDisplay = new CreditDisplay(creditContainer);
 * ```
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html">Online Documentation</a>
 *
 * @constructor
 * @property [container] The HTML element where credits will be displayed
 * @param [delimiter] The string to separate text credits
 *   Default value - `' • '`
 * @param [viewport] The HTML element that will contain the credits popup
 *   Default value - `document.body`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html">Online Documentation</a>
 */
external class CreditDisplay(
    var container: dom.html.HTMLElement,
    delimiter: String? = definedExternally,
    viewport: dom.html.HTMLElement? = definedExternally,
) {
    /**
     * Adds a credit to the list of current credits to be displayed in the credit container
     * @param [credit] The credit to display
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#addCredit">Online Documentation</a>
     */
    fun addCredit(credit: Credit)

    /**
     * Adds credits that will persist until they are removed
     * @param [credit] The credit to added to defaults
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#addDefaultCredit">Online Documentation</a>
     */
    fun addDefaultCredit(credit: Credit)

    /**
     * Removes a default credit
     * @param [credit] The credit to be removed from defaults
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#removeDefaultCredit">Online Documentation</a>
     */
    fun removeDefaultCredit(credit: Credit)

    /**
     * Updates the credit display before a new frame is rendered.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#update">Online Documentation</a>
     */
    fun update()

    /**
     * Resets the credit display to a beginning of frame state, clearing out current credits.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#beginFrame">Online Documentation</a>
     */
    fun beginFrame()

    /**
     * Sets the credit display to the end of frame state, displaying credits from the last frame in the credit container.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#endFrame">Online Documentation</a>
     */
    fun endFrame()

    /**
     * Destroys the resources held by this object.  Destroying an object allows for deterministic
     * release of resources, instead of relying on the garbage collector to destroy this object.
     *
     * Once an object is destroyed, it should not be used; calling any function other than
     * `isDestroyed` will result in a [DeveloperError] exception.  Therefore,
     * assign the return value (`undefined`) to the object as done in the example.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#destroy">Online Documentation</a>
     */
    fun destroy()

    /**
     * Returns true if this object was destroyed; otherwise, false.
     * @return `true` if this object was destroyed; otherwise, `false`.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#isDestroyed">Online Documentation</a>
     */
    fun isDestroyed(): Boolean

    companion object {
        /**
         * Gets or sets the Cesium logo credit.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/CreditDisplay.html#.cesiumCredit">Online Documentation</a>
         */
        var cesiumCredit: Credit
    }
}
