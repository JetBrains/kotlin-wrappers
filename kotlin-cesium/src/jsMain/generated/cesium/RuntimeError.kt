// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "EXTERNAL_CLASS_CONSTRUCTOR_PROPERTY_PARAMETER",
)

package cesium

/**
 * Constructs an exception object that is thrown due to an error that can occur at runtime, e.g.,
 * out of memory, could not compile shader, etc.  If a function may throw this
 * exception, the calling code should be prepared to catch it.
 *
 * On the other hand, a [DeveloperError] indicates an exception due
 * to a developer error, e.g., invalid argument, that usually indicates a bug in the
 * calling code.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RuntimeError.html">Online Documentation</a>
 *
 * @constructor
 * @property [message] The error message for this exception.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RuntimeError.html">Online Documentation</a>
 */
external class RuntimeError(val message: String = definedExternally) {
    /**
     * 'RuntimeError' indicating that this exception was thrown due to a runtime error.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RuntimeError.html#name">Online Documentation</a>
     */
    val name: String

    /**
     * The stack trace of this exception, if available.
     * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/RuntimeError.html#stack">Online Documentation</a>
     */
    val stack: String
}
