// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * Logs a deprecation message to the console.  Use this function instead of
 * `console.log` directly since this does not log duplicate messages
 * unless it is called from multiple workers.
 * ```
 * // Deprecated function or class
 * function Foo() {
 *    deprecationWarning('Foo', 'Foo was deprecated in Cesium 1.01.  It will be removed in 1.03.  Use newFoo instead.');
 *    // ...
 * }
 *
 * // Deprecated function
 * Bar.prototype.func = function() {
 *    deprecationWarning('Bar.func', 'Bar.func() was deprecated in Cesium 1.01.  It will be removed in 1.03.  Use Bar.newFunc() instead.');
 *    // ...
 * };
 *
 * // Deprecated property
 * Object.defineProperties(Bar.prototype, {
 *     prop : {
 *         get : function() {
 *             deprecationWarning('Bar.prop', 'Bar.prop was deprecated in Cesium 1.01.  It will be removed in 1.03.  Use Bar.newProp instead.');
 *             // ...
 *         },
 *         set : function(value) {
 *             deprecationWarning('Bar.prop', 'Bar.prop was deprecated in Cesium 1.01.  It will be removed in 1.03.  Use Bar.newProp instead.');
 *             // ...
 *         }
 *     }
 * });
 * ```
 * @param [identifier] The unique identifier for this deprecated API.
 * @param [message] The message to log to the console.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#deprecationWarning">Online Documentation</a>
 */
external fun deprecationWarning(
    identifier: String,
    message: String,
)
