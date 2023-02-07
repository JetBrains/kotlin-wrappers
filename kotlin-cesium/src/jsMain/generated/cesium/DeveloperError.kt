// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Constructs an exception object that is thrown due to a developer error, e.g., invalid argument,
 * argument out of range, etc.  This exception should only be thrown during development;
 * it usually indicates a bug in the calling code.  This exception should never be
 * caught; instead the calling code should strive not to generate it.
 *
 * On the other hand, a [RuntimeError] indicates an exception that may
 * be thrown at runtime, e.g., out of memory, that the calling code should be prepared
 * to catch.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DeveloperError.html">Online Documentation</a>
 *
 * @constructor
 * @property [message] The error message for this exception.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DeveloperError.html">Online Documentation</a>
 */
external class DeveloperError(val message: String = definedExternally) {
    /**
     * 'DeveloperError' indicating that this exception was thrown due to a developer error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DeveloperError.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The stack trace of this exception, if available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/DeveloperError.html#stack">Online Documentation</a>
     */
    val stack: String
}
