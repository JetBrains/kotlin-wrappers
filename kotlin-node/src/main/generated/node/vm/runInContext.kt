// Automatically generated - do not modify!

@file:JsModule("node:vm")
@file:JsNonModule

package node.vm

/**
 * The `vm.runInContext()` method compiles `code`, runs it within the context of
 * the `contextifiedObject`, then returns the result. Running code does not have
 * access to the local scope. The `contextifiedObject` object _must_ have been
 * previously `contextified` using the {@link createContext} method.
 *
 * If `options` is a string, then it specifies the filename.
 *
 * The following example compiles and executes different scripts using a single `contextified` object:
 *
 * ```js
 * const vm = require('vm');
 *
 * const contextObject = { globalVar: 1 };
 * vm.createContext(contextObject);
 *
 * for (let i = 0; i < 10; ++i) {
 *   vm.runInContext('globalVar *= 2;', contextObject);
 * }
 * console.log(contextObject);
 * // Prints: { globalVar: 1024 }
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextifiedObject The `contextified` object that will be used as the `global` when the `code` is compiled and run.
 * @return the result of the very last statement executed in the script.
 */
external fun runInContext(
    code: String,
    contextifiedObject: Context,
    options: Any /* RunningScriptOptions | string */ = definedExternally,
): Any
