// Automatically generated - do not modify!

@file:JsModule("cesium")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Provides details about an error that occurred in an [ImageryProvider] or a [TerrainProvider].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html">Online Documentation</a>
 *
 * @constructor
 * @param [provider] The imagery or terrain provider that experienced the error.
 * @property [message] A message describing the error.
 * @property [x] The X coordinate of the tile that experienced the error, or undefined if the error
 *   is not specific to a particular tile.
 * @property [y] The Y coordinate of the tile that experienced the error, or undefined if the error
 *   is not specific to a particular tile.
 * @property [level] The level of the tile that experienced the error, or undefined if the error
 *   is not specific to a particular tile.
 * @property [timesRetried] The number of times this operation has been retried.
 *   Default value - `0`
 * @property [error] The error or exception that occurred, if any.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html">Online Documentation</a>
 */
external class TileProviderError(
    provider: ImageryProvider,
    var message: String,
    var x: Double = definedExternally,
    var y: Double = definedExternally,
    var level: Int = definedExternally,
    var timesRetried: Double = definedExternally,
    var error: Error = definedExternally,
) {
    constructor(
        provider: TerrainProvider,
        message: String,
        x: Double? = definedExternally,
        y: Double? = definedExternally,
        level: Int? = definedExternally,
        timesRetried: Double? = definedExternally,
        error: Error? = definedExternally,
    )

    /**
     * The [ImageryProvider] or [TerrainProvider] that experienced the error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#provider">Online Documentation</a>
     */
    var provider: dynamic

    /**
     * True if the failed operation should be retried; otherwise, false.  The imagery or terrain provider
     * will set the initial value of this property before raising the event, but any listeners
     * can change it.  The value after the last listener is invoked will be acted upon.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#retry">Online Documentation</a>
     */
    var retry: Boolean

    companion object {
        /**
         * Reports an error in an [ImageryProvider] or [TerrainProvider] by raising an event if it has any listeners, or by
         * logging the error to the console if the event has no listeners.  This method also tracks the number
         * of times the operation has been retried.
         * @param [previousError] The error instance returned by this function the last
         *   time it was called for this error, or undefined if this is the first time this error has
         *   occurred.
         * @param [provider] The imagery or terrain provider that encountered the error.
         * @param [event] The event to raise to inform listeners of the error.
         * @param [message] The message describing the error.
         * @param [x] The X coordinate of the tile that experienced the error, or undefined if the
         *   error is not specific to a particular tile.
         * @param [y] The Y coordinate of the tile that experienced the error, or undefined if the
         *   error is not specific to a particular tile.
         * @param [level] The level-of-detail of the tile that experienced the error, or undefined if the
         *   error is not specific to a particular tile.
         * @param [errorDetails] The error or exception that occurred, if any.
         * @return The error instance that was passed to the event listeners and that
         *   should be passed to this function the next time it is called for the same error in order
         *   to track retry counts.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#.reportError">Online Documentation</a>
         */
        fun reportError(
            previousError: TileProviderError,
            provider: ImageryProvider,
            event: DefaultEvent,
            message: String,
            x: Double,
            y: Double,
            level: Int,
            errorDetails: Error? = definedExternally,
        ): TileProviderError

        fun reportError(
            previousError: TileProviderError,
            provider: TerrainProvider,
            event: DefaultEvent,
            message: String,
            x: Double,
            y: Double,
            level: Int,
            errorDetails: Error? = definedExternally,
        ): TileProviderError

        /**
         * Handles an error in an [ImageryProvider] or [TerrainProvider] by raising an event if it has any listeners, or by
         * logging the error to the console if the event has no listeners.  This method also tracks the number
         * of times the operation has been retried and will automatically retry if requested to do so by the
         * event listeners.
         * @param [previousError] The error instance returned by this function the last
         *   time it was called for this error, or undefined if this is the first time this error has
         *   occurred.
         * @param [provider] The imagery or terrain provider that encountered the error.
         * @param [event] The event to raise to inform listeners of the error.
         * @param [message] The message describing the error.
         * @param [x] The X coordinate of the tile that experienced the error, or undefined if the
         *   error is not specific to a particular tile.
         * @param [y] The Y coordinate of the tile that experienced the error, or undefined if the
         *   error is not specific to a particular tile.
         * @param [level] The level-of-detail of the tile that experienced the error, or undefined if the
         *   error is not specific to a particular tile.
         * @param [retryFunction] The function to call to retry the operation.  If undefined, the
         *   operation will not be retried.
         * @param [errorDetails] The error or exception that occurred, if any.
         * @return The error instance that was passed to the event listeners and that
         *   should be passed to this function the next time it is called for the same error in order
         *   to track retry counts.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#.handleError">Online Documentation</a>
         */
        fun handleError(
            previousError: TileProviderError,
            provider: ImageryProvider,
            event: DefaultEvent,
            message: String,
            x: Double,
            y: Double,
            level: Int,
            retryFunction: RetryFunction,
            errorDetails: Error? = definedExternally,
        ): TileProviderError

        fun handleError(
            previousError: TileProviderError,
            provider: TerrainProvider,
            event: DefaultEvent,
            message: String,
            x: Double,
            y: Double,
            level: Int,
            retryFunction: RetryFunction,
            errorDetails: Error? = definedExternally,
        ): TileProviderError

        /**
         * Reports success of an operation by resetting the retry count of a previous error, if any.  This way,
         * if the error occurs again in the future, the listeners will be informed that it has not yet been retried.
         * @param [previousError] The previous error, or undefined if this operation has
         *   not previously resulted in an error.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#.reportSuccess">Online Documentation</a>
         */
        fun reportSuccess(previousError: TileProviderError)

        /**
         * Handles success of an operation by resetting the retry count of a previous error, if any.  This way,
         * if the error occurs again in the future, the listeners will be informed that it has not yet been retried.
         * @param [previousError] The previous error, or undefined if this operation has
         *   not previously resulted in an error.
         * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#.handleSuccess">Online Documentation</a>
         */
        fun handleSuccess(previousError: TileProviderError)
    }
}

/**
 * A function that will be called to retry the operation.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/TileProviderError.html#.RetryFunction">Online Documentation</a>
 */
typealias RetryFunction = () -> Unit
