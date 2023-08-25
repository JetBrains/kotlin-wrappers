// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

/**
 * If given a `contextObject`, the `vm.createContext()` method will `prepare
 * that object` so that it can be used in calls to {@link runInContext} or `script.runInContext()`. Inside such scripts,
 * the `contextObject` will be the global object, retaining all of its existing
 * properties but also having the built-in objects and functions any standard [global object](https://es5.github.io/#x15.1) has. Outside of scripts run by the vm module, global variables
 * will remain unchanged.
 *
 * ```js
 * const vm = require('vm');
 *
 * global.globalVar = 3;
 *
 * const context = { globalVar: 1 };
 * vm.createContext(context);
 *
 * vm.runInContext('globalVar *= 2;', context);
 *
 * console.log(context);
 * // Prints: { globalVar: 2 }
 *
 * console.log(global.globalVar);
 * // Prints: 3
 * ```
 *
 * If `contextObject` is omitted (or passed explicitly as `undefined`), a new,
 * empty `contextified` object will be returned.
 *
 * The `vm.createContext()` method is primarily useful for creating a single
 * context that can be used to run multiple scripts. For instance, if emulating a
 * web browser, the method can be used to create a single context representing a
 * window's global object, then run all `<script>` tags together within that
 * context.
 *
 * The provided `name` and `origin` of the context are made visible through the
 * Inspector API.
 * @since v0.3.1
 * @return contextified object.
 */
external fun createContext(
    sandbox: Context = definedExternally,
    options: CreateContextOptions = definedExternally,
): Context
