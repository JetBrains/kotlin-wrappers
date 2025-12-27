// Automatically generated - do not modify!

package node.util

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface DebugLogger :
    js.function.JsFunction<js.array.Tuple1<String>, Unit> /* DebugLoggerFunction */ {
    /**
     * The `util.debuglog().enabled` getter is used to create a test that can be used
     * in conditionals based on the existence of the `NODE_DEBUG` environment variable.
     * If the `section` name appears within the value of that environment variable,
     * then the returned value will be `true`. If not, then the returned value will be
     * `false`.
     *
     * ```js
     * import { debuglog } from 'node:util';
     * const enabled = debuglog('foo').enabled;
     * if (enabled) {
     *   console.log('hello from foo [%d]', 123);
     * }
     * ```
     *
     * If this program is run with `NODE_DEBUG=foo` in the environment, then it will
     * output something like:
     *
     * ```console
     * hello from foo [123]
     * ```
     */
    var enabled: Boolean
}
