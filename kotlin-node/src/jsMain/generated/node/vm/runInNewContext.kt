// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

/**
 * The `vm.runInNewContext()` first contextifies the given `contextObject` (or
 * creates a new `contextObject` if passed as `undefined`), compiles the `code`,
 * runs it within the created context, then returns the result. Running code
 * does not have access to the local scope.
 *
 * If `options` is a string, then it specifies the filename.
 *
 * The following example compiles and executes code that increments a global
 * variable and sets a new one. These globals are contained in the `contextObject`.
 *
 * ```js
 * const vm = require('vm');
 *
 * const contextObject = {
 *   animal: 'cat',
 *   count: 2
 * };
 *
 * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
 * console.log(contextObject);
 * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextObject An object that will be `contextified`. If `undefined`, a new object will be created.
 * @return the result of the very last statement executed in the script.
 */
external fun runInNewContext(
    code: String,
    contextObject: Context = definedExternally,
    options: Any /* RunningScriptOptions | string */ = definedExternally,
): Any
