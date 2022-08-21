// Automatically generated - do not modify!

@file:JsModule("node:vm")
@file:JsNonModule

package node.vm

import node.buffer.Buffer

external class Script {
    constructor(
        code: String,
        options: ScriptOptions = definedExternally,
    )

    /**
     * Runs the compiled code contained by the `vm.Script` object within the given`contextifiedObject` and returns the result. Running code does not have access
     * to local scope.
     *
     * The following example compiles code that increments a global variable, sets
     * the value of another global variable, then execute the code multiple times.
     * The globals are contained in the `context` object.
     *
     * ```js
     * const vm = require('vm');
     *
     * const context = {
     *   animal: 'cat',
     *   count: 2
     * };
     *
     * const script = new vm.Script('count += 1; name = "kitty";');
     *
     * vm.createContext(context);
     * for (let i = 0; i < 10; ++i) {
     *   script.runInContext(context);
     * }
     *
     * console.log(context);
     * // Prints: { animal: 'cat', count: 12, name: 'kitty' }
     * ```
     *
     * Using the `timeout` or `breakOnSigint` options will result in new event loops
     * and corresponding threads being started, which have a non-zero performance
     * overhead.
     * @since v0.3.1
     * @param contextifiedObject A `contextified` object as returned by the `vm.createContext()` method.
     * @return the result of the very last statement executed in the script.
     */
    fun runInContext(
        contextifiedObject: Context,
        options: RunningScriptOptions = definedExternally,
    ): Any

    /**
     * First contextifies the given `contextObject`, runs the compiled code contained
     * by the `vm.Script` object within the created context, and returns the result.
     * Running code does not have access to local scope.
     *
     * The following example compiles code that sets a global variable, then executes
     * the code multiple times in different contexts. The globals are set on and
     * contained within each individual `context`.
     *
     * ```js
     * const vm = require('vm');
     *
     * const script = new vm.Script('globalVar = "set"');
     *
     * const contexts = [{}, {}, {}];
     * contexts.forEach((context) => {
     *   script.runInNewContext(context);
     * });
     *
     * console.log(contexts);
     * // Prints: [{ globalVar: 'set' }, { globalVar: 'set' }, { globalVar: 'set' }]
     * ```
     * @since v0.3.1
     * @param contextObject An object that will be `contextified`. If `undefined`, a new object will be created.
     * @return the result of the very last statement executed in the script.
     */
    fun runInNewContext(
        contextObject: Context = definedExternally,
        options: RunningScriptOptions = definedExternally,
    ): Any

    /**
     * Runs the compiled code contained by the `vm.Script` within the context of the
     * current `global` object. Running code does not have access to local scope, but _does_ have access to the current `global` object.
     *
     * The following example compiles code that increments a `global` variable then
     * executes that code multiple times:
     *
     * ```js
     * const vm = require('vm');
     *
     * global.globalVar = 0;
     *
     * const script = new vm.Script('globalVar += 1', { filename: 'myfile.vm' });
     *
     * for (let i = 0; i < 1000; ++i) {
     *   script.runInThisContext();
     * }
     *
     * console.log(globalVar);
     *
     * // 1000
     * ```
     * @since v0.3.1
     * @return the result of the very last statement executed in the script.
     */
    fun runInThisContext(options: RunningScriptOptions = definedExternally): Any

    /**
     * Creates a code cache that can be used with the `Script` constructor's`cachedData` option. Returns a `Buffer`. This method may be called at any
     * time and any number of times.
     *
     * ```js
     * const script = new vm.Script(`
     * function add(a, b) {
     *   return a + b;
     * }
     *
     * const x = add(1, 2);
     * `);
     *
     * const cacheWithoutX = script.createCachedData();
     *
     * script.runInThisContext();
     *
     * const cacheWithX = script.createCachedData();
     * ```
     * @since v10.6.0
     */
    fun createCachedData(): Buffer

    /** @deprecated in favor of `script.createCachedData()` */
    var cachedDataProduced: Boolean?
    var cachedDataRejected: Boolean?
    var cachedData: Buffer?
}
