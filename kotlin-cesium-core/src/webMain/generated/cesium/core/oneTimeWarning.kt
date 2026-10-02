// Automatically generated - do not modify!

@file:JsModule("@cesium/core")

package cesium.core

/**
 * Logs a one time message to the console.  Use this function instead of
 * `console.log` directly since this does not log duplicate messages
 * unless it is called from multiple workers.
 * ```
 * for(let i=0;i<foo.length;++i) {
 *    if (!defined(foo[i].bar)) {
 *       // Something that can be recovered from but may happen a lot
 *       oneTimeWarning('foo.bar undefined', 'foo.bar is undefined. Setting to 0.');
 *       foo[i].bar = 0;
 *       // ...
 *    }
 * }
 * ```
 * @param [identifier] The unique identifier for this warning.
 * @param [message] The message to log to the console.
 *   Default value - `identifier`
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#oneTimeWarning">Online Documentation</a>
 */
external fun oneTimeWarning(
    identifier: String,
    message: String? = definedExternally,
)
