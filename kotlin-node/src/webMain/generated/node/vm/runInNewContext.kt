// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

/**
 * This method is a shortcut to
 * `(new vm.Script(code, options)).runInContext(vm.createContext(options), options)`.
 * If `options` is a string, then it specifies the filename.
 *
 * It does several things at once:
 *
 * 1. Creates a new context.
 * 2. If `contextObject` is an object, contextifies it with the new context.
 *    If  `contextObject` is undefined, creates a new object and contextifies it.
 *    If `contextObject` is `vm.constants.DONT_CONTEXTIFY`, don't contextify anything.
 * 3. Compiles the code as a`vm.Script`
 * 4. Runs the compield code within the created context. The code does not have access to the scope in
 *    which this method is called.
 * 5. Returns the result.
 *
 * The following example compiles and executes code that increments a global
 * variable and sets a new one. These globals are contained in the `contextObject`.
 *
 * ```js
 * const vm = require('node:vm');
 *
 * const contextObject = {
 *   animal: 'cat',
 *   count: 2,
 * };
 *
 * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
 * console.log(contextObject);
 * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
 *
 * // This would throw if the context is created from a contextified object.
 * // vm.constants.DONT_CONTEXTIFY allows creating contexts with ordinary global objects that
 * // can be frozen.
 * const frozenContext = vm.runInNewContext('Object.freeze(globalThis); globalThis;', vm.constants.DONT_CONTEXTIFY);
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextObject Either `vm.constants.DONT_CONTEXTIFY` or an object that will be contextified.
 * If `undefined`, an empty contextified object will be created for backwards compatibility.
 * @return the result of the very last statement executed in the script.
 */
external fun runInNewContext(code: String): Any?

/**
 * This method is a shortcut to
 * `(new vm.Script(code, options)).runInContext(vm.createContext(options), options)`.
 * If `options` is a string, then it specifies the filename.
 *
 * It does several things at once:
 *
 * 1. Creates a new context.
 * 2. If `contextObject` is an object, contextifies it with the new context.
 *    If  `contextObject` is undefined, creates a new object and contextifies it.
 *    If `contextObject` is `vm.constants.DONT_CONTEXTIFY`, don't contextify anything.
 * 3. Compiles the code as a`vm.Script`
 * 4. Runs the compield code within the created context. The code does not have access to the scope in
 *    which this method is called.
 * 5. Returns the result.
 *
 * The following example compiles and executes code that increments a global
 * variable and sets a new one. These globals are contained in the `contextObject`.
 *
 * ```js
 * const vm = require('node:vm');
 *
 * const contextObject = {
 *   animal: 'cat',
 *   count: 2,
 * };
 *
 * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
 * console.log(contextObject);
 * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
 *
 * // This would throw if the context is created from a contextified object.
 * // vm.constants.DONT_CONTEXTIFY allows creating contexts with ordinary global objects that
 * // can be frozen.
 * const frozenContext = vm.runInNewContext('Object.freeze(globalThis); globalThis;', vm.constants.DONT_CONTEXTIFY);
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextObject Either `vm.constants.DONT_CONTEXTIFY` or an object that will be contextified.
 * If `undefined`, an empty contextified object will be created for backwards compatibility.
 * @return the result of the very last statement executed in the script.
 */
external fun runInNewContext(
    code: String,
    contextObject: Context = definedExternally,
    options: RunningCodeInNewContextOptions = definedExternally,
): Any?

/**
 * This method is a shortcut to
 * `(new vm.Script(code, options)).runInContext(vm.createContext(options), options)`.
 * If `options` is a string, then it specifies the filename.
 *
 * It does several things at once:
 *
 * 1. Creates a new context.
 * 2. If `contextObject` is an object, contextifies it with the new context.
 *    If  `contextObject` is undefined, creates a new object and contextifies it.
 *    If `contextObject` is `vm.constants.DONT_CONTEXTIFY`, don't contextify anything.
 * 3. Compiles the code as a`vm.Script`
 * 4. Runs the compield code within the created context. The code does not have access to the scope in
 *    which this method is called.
 * 5. Returns the result.
 *
 * The following example compiles and executes code that increments a global
 * variable and sets a new one. These globals are contained in the `contextObject`.
 *
 * ```js
 * const vm = require('node:vm');
 *
 * const contextObject = {
 *   animal: 'cat',
 *   count: 2,
 * };
 *
 * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
 * console.log(contextObject);
 * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
 *
 * // This would throw if the context is created from a contextified object.
 * // vm.constants.DONT_CONTEXTIFY allows creating contexts with ordinary global objects that
 * // can be frozen.
 * const frozenContext = vm.runInNewContext('Object.freeze(globalThis); globalThis;', vm.constants.DONT_CONTEXTIFY);
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextObject Either `vm.constants.DONT_CONTEXTIFY` or an object that will be contextified.
 * If `undefined`, an empty contextified object will be created for backwards compatibility.
 * @return the result of the very last statement executed in the script.
 */
external fun runInNewContext(
    code: String,
    contextObject: Context = definedExternally,
    options: String = definedExternally,
): Any?

/**
 * This method is a shortcut to
 * `(new vm.Script(code, options)).runInContext(vm.createContext(options), options)`.
 * If `options` is a string, then it specifies the filename.
 *
 * It does several things at once:
 *
 * 1. Creates a new context.
 * 2. If `contextObject` is an object, contextifies it with the new context.
 *    If  `contextObject` is undefined, creates a new object and contextifies it.
 *    If `contextObject` is `vm.constants.DONT_CONTEXTIFY`, don't contextify anything.
 * 3. Compiles the code as a`vm.Script`
 * 4. Runs the compield code within the created context. The code does not have access to the scope in
 *    which this method is called.
 * 5. Returns the result.
 *
 * The following example compiles and executes code that increments a global
 * variable and sets a new one. These globals are contained in the `contextObject`.
 *
 * ```js
 * const vm = require('node:vm');
 *
 * const contextObject = {
 *   animal: 'cat',
 *   count: 2,
 * };
 *
 * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
 * console.log(contextObject);
 * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
 *
 * // This would throw if the context is created from a contextified object.
 * // vm.constants.DONT_CONTEXTIFY allows creating contexts with ordinary global objects that
 * // can be frozen.
 * const frozenContext = vm.runInNewContext('Object.freeze(globalThis); globalThis;', vm.constants.DONT_CONTEXTIFY);
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextObject Either `vm.constants.DONT_CONTEXTIFY` or an object that will be contextified.
 * If `undefined`, an empty contextified object will be created for backwards compatibility.
 * @return the result of the very last statement executed in the script.
 */
external fun runInNewContext(
    code: String,
    contextObject: Double = definedExternally,
    options: RunningCodeInNewContextOptions = definedExternally,
): Any?

/**
 * This method is a shortcut to
 * `(new vm.Script(code, options)).runInContext(vm.createContext(options), options)`.
 * If `options` is a string, then it specifies the filename.
 *
 * It does several things at once:
 *
 * 1. Creates a new context.
 * 2. If `contextObject` is an object, contextifies it with the new context.
 *    If  `contextObject` is undefined, creates a new object and contextifies it.
 *    If `contextObject` is `vm.constants.DONT_CONTEXTIFY`, don't contextify anything.
 * 3. Compiles the code as a`vm.Script`
 * 4. Runs the compield code within the created context. The code does not have access to the scope in
 *    which this method is called.
 * 5. Returns the result.
 *
 * The following example compiles and executes code that increments a global
 * variable and sets a new one. These globals are contained in the `contextObject`.
 *
 * ```js
 * const vm = require('node:vm');
 *
 * const contextObject = {
 *   animal: 'cat',
 *   count: 2,
 * };
 *
 * vm.runInNewContext('count += 1; name = "kitty"', contextObject);
 * console.log(contextObject);
 * // Prints: { animal: 'cat', count: 3, name: 'kitty' }
 *
 * // This would throw if the context is created from a contextified object.
 * // vm.constants.DONT_CONTEXTIFY allows creating contexts with ordinary global objects that
 * // can be frozen.
 * const frozenContext = vm.runInNewContext('Object.freeze(globalThis); globalThis;', vm.constants.DONT_CONTEXTIFY);
 * ```
 * @since v0.3.1
 * @param code The JavaScript code to compile and run.
 * @param contextObject Either `vm.constants.DONT_CONTEXTIFY` or an object that will be contextified.
 * If `undefined`, an empty contextified object will be created for backwards compatibility.
 * @return the result of the very last statement executed in the script.
 */
external fun runInNewContext(
    code: String,
    contextObject: Double = definedExternally,
    options: String = definedExternally,
): Any?
