// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

/**
 * This feature is only available with the `--experimental-vm-modules` command
 * flag enabled.
 *
 * The `vm.Module` class provides a low-level interface for using
 * ECMAScript modules in VM contexts. It is the counterpart of the `vm.Script`
 * class that closely mirrors [Module Record](https://tc39.es/ecma262/#sec-abstract-module-records)s as defined in the ECMAScript
 * specification.
 *
 * Unlike `vm.Script` however, every `vm.Module` object is bound to a context from
 * its creation.
 *
 * Using a `vm.Module` object requires three distinct steps: creation/parsing,
 * linking, and evaluation. These three steps are illustrated in the following
 * example.
 *
 * This implementation lies at a lower level than the `ECMAScript Module
 * loader`. There is also no way to interact with the Loader yet, though
 * support is planned.
 *
 * ```js
 * import vm from 'node:vm';
 *
 * const contextifiedObject = vm.createContext({
 *   secret: 42,
 *   print: console.log,
 * });
 *
 * // Step 1
 * //
 * // Create a Module by constructing a new `vm.SourceTextModule` object. This
 * // parses the provided source text, throwing a `SyntaxError` if anything goes
 * // wrong. By default, a Module is created in the top context. But here, we
 * // specify `contextifiedObject` as the context this Module belongs to.
 * //
 * // Here, we attempt to obtain the default export from the module "foo", and
 * // put it into local binding "secret".
 *
 * const rootModule = new vm.SourceTextModule(`
 *   import s from 'foo';
 *   s;
 *   print(s);
 * `, { context: contextifiedObject });
 *
 * // Step 2
 * //
 * // "Link" the imported dependencies of this Module to it.
 * //
 * // Obtain the requested dependencies of a SourceTextModule by
 * // `sourceTextModule.moduleRequests` and resolve them.
 * //
 * // Even top-level Modules without dependencies must be explicitly linked. The
 * // array passed to `sourceTextModule.linkRequests(modules)` can be
 * // empty, however.
 * //
 * // Note: This is a contrived example in that the resolveAndLinkDependencies
 * // creates a new "foo" module every time it is called. In a full-fledged
 * // module system, a cache would probably be used to avoid duplicated modules.
 *
 * const moduleMap = new Map([
 *   ['root', rootModule],
 * ]);
 *
 * function resolveAndLinkDependencies(module) {
 *   const requestedModules = module.moduleRequests.map((request) => {
 *     // In a full-fledged module system, the resolveAndLinkDependencies would
 *     // resolve the module with the module cache key `[specifier, attributes]`.
 *     // In this example, we just use the specifier as the key.
 *     const specifier = request.specifier;
 *
 *     let requestedModule = moduleMap.get(specifier);
 *     if (requestedModule === undefined) {
 *       requestedModule = new vm.SourceTextModule(`
 *         // The "secret" variable refers to the global variable we added to
 *         // "contextifiedObject" when creating the context.
 *         export default secret;
 *       `, { context: module.context });
 *       moduleMap.set(specifier, requestedModule);
 *       // Resolve the dependencies of the new module as well.
 *       resolveAndLinkDependencies(requestedModule);
 *     }
 *
 *     return requestedModule;
 *   });
 *
 *   module.linkRequests(requestedModules);
 * }
 *
 * resolveAndLinkDependencies(rootModule);
 * rootModule.instantiate();
 *
 * // Step 3
 * //
 * // Evaluate the Module. The evaluate() method returns a promise which will
 * // resolve after the module has finished evaluating.
 *
 * // Prints 42.
 * await rootModule.evaluate();
 * ```
 * @since v13.0.0, v12.16.0
 * @experimental
 */
open external class Module {
    /**
     * If the `module.status` is `'errored'`, this property contains the exception
     * thrown by the module during evaluation. If the status is anything else,
     * accessing this property will result in a thrown exception.
     *
     * The value `undefined` cannot be used for cases where there is not a thrown
     * exception due to possible ambiguity with `throw undefined;`.
     *
     * Corresponds to the `[[EvaluationError]]` field of [Cyclic Module Record](https://tc39.es/ecma262/#sec-cyclic-module-records) s
     * in the ECMAScript specification.
     */
    var error: Any?

    /**
     * The identifier of the current module, as set in the constructor.
     */
    var identifier: String
    var context: Context

    /**
     * The namespace object of the module. This is only available after linking
     * (`module.link()`) has completed.
     *
     * Corresponds to the [GetModuleNamespace](https://tc39.es/ecma262/#sec-getmodulenamespace) abstract operation in the ECMAScript
     * specification.
     */
    var namespace: Any

    /**
     * The current status of the module. Will be one of:
     *
     * * `'unlinked'`: `module.link()` has not yet been called.
     * * `'linking'`: `module.link()` has been called, but not all Promises returned
     * by the linker function have been resolved yet.
     * * `'linked'`: The module has been linked successfully, and all of its
     * dependencies are linked, but `module.evaluate()` has not yet been called.
     * * `'evaluating'`: The module is being evaluated through a `module.evaluate()` on
     * itself or a parent module.
     * * `'evaluated'`: The module has been successfully evaluated.
     * * `'errored'`: The module has been evaluated, but an exception was thrown.
     *
     * Other than `'errored'`, this status string corresponds to the specification's [Cyclic Module Record](https://tc39.es/ecma262/#sec-cyclic-module-records)'s `[[Status]]` field. `'errored'`
     * corresponds to `'evaluated'` in the specification, but with `[[EvaluationError]]` set to a
     * value that is not `undefined`.
     */
    var status: ModuleStatus

    /**
     * Evaluate the module and its depenendencies. Corresponds to the [Evaluate() concrete method](https://tc39.es/ecma262/#sec-moduleevaluation)
     * field of [Cyclic Module Record](https://tc39.es/ecma262/#sec-cyclic-module-records)s in the ECMAScript specification.
     *
     * If the module is a `vm.SourceTextModule`, `evaluate()` must be called after the module has been instantiated;
     * otherwise `evaluate()` will return a rejected promise.
     *
     * For a `vm.SourceTextModule`, the promise returned by `evaluate()` may be fulfilled either synchronously or asynchronously:
     * 1. If the `vm.SourceTextModule` has no top-level `await` in itself or any of its dependencies, the promise will be
     * fulfilled synchronously after the module and all its dependencies have been evaluated.
     *    1. If the evaluation succeeds, the promise will be _synchronously_ resolved to `undefined`.
     *    2. If the evaluation results in an exception, the promise will be _synchronously_ rejected with the exception that causes the evaluation to fail, which is the same as `module.error`.
     * 2. If the `vm.SourceTextModule` has top-level `await` in itself or any of its dependencies, the promise will be fulfilled asynchronously after the module and all its dependencies have been evaluated.
     *    1. If the evaluation succeeds, the promise will be _asynchronously_ resolved to `undefined`.
     *    2. If the evaluation results in an exception, the promise will be _asynchronously_ rejected with the exception that causes the evaluation to fail.
     *
     * If the module is a `vm.SyntheticModule`, `evaluate()` always returns a promise that fulfills synchronously,
     * see the specification of [Evaluate() of a Synthetic Module Record](https://tc39.es/ecma262/#sec-smr-Evaluate):
     * 1. If the `evaluateCallback` passed to its constructor throws an exception synchronously, `evaluate()` returns a promise that will be synchronously rejected with that exception.
     * 2. If the `evaluateCallback` does not throw an exception, `evaluate()` returns a promise that will be synchronously resolved to `undefined`.
     *
     * The `evaluateCallback` of a `vm.SyntheticModule` is executed synchronously within the `evaluate()` call, and its return value is discarded. This means if `evaluateCallback` is an asynchronous function, the promise
     * returned by `evaluate()` will not reflect its asynchronous behavior, and any rejections from an asynchronous `evaluateCallback` will be lost.
     *
     * evaluate() could also be called again after the module has already been evaluated, in which case:
     * 1. If the initial evaluation ended in success (`module.status` is `'evaluated'`), it will do nothing and return a promise that resolves to `undefined`.
     * 2. If the initial evaluation resulted in an exception (`module.status` is `'errored'`), it will re-reject the exception that the initial evaluation resulted in.
     *
     * This method cannot be called while the module is being evaluated (`module.status` is `'evaluating'`).
     * @return Fulfills with `undefined` upon success.
     */
    @JsName("evaluate")
    fun evaluateAsync(options: ModuleEvaluateOptions = definedExternally): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun evaluate(options: ModuleEvaluateOptions = definedExternally): js.core.Void

    /**
     * Link module dependencies. This method must be called before evaluation, and
     * can only be called once per module.
     *
     * Use `sourceTextModule.linkRequests(modules)` and
     * `sourceTextModule.instantiate()` to link modules either synchronously or
     * asynchronously.
     *
     * The function is expected to return a `Module` object or a `Promise` that
     * eventually resolves to a `Module` object. The returned `Module` must satisfy the
     * following two invariants:
     *
     * * It must belong to the same context as the parent `Module`.
     * * Its `status` must not be `'errored'`.
     *
     * If the returned `Module`'s `status` is `'unlinked'`, this method will be
     * recursively called on the returned `Module` with the same provided `linker` function.
     *
     * `link()` returns a `Promise` that will either get resolved when all linking
     * instances resolve to a valid `Module`, or rejected if the linker function either
     * throws an exception or returns an invalid `Module`.
     *
     * The linker function roughly corresponds to the implementation-defined [HostResolveImportedModule](https://tc39.es/ecma262/#sec-hostresolveimportedmodule) abstract operation in the
     * ECMAScript
     * specification, with a few key differences:
     *
     * * The linker function is allowed to be asynchronous while [HostResolveImportedModule](https://tc39.es/ecma262/#sec-hostresolveimportedmodule) is synchronous.
     *
     * The actual [HostResolveImportedModule](https://tc39.es/ecma262/#sec-hostresolveimportedmodule) implementation used during module
     * linking is one that returns the modules linked during linking. Since at
     * that point all modules would have been fully linked already, the [HostResolveImportedModule](https://tc39.es/ecma262/#sec-hostresolveimportedmodule) implementation is fully synchronous per
     * specification.
     *
     * Corresponds to the [Link() concrete method](https://tc39.es/ecma262/#sec-moduledeclarationlinking) field of [Cyclic Module Record](https://tc39.es/ecma262/#sec-cyclic-module-records) s in
     * the ECMAScript specification.
     */
    @JsName("link")
    fun linkAsync(linker: ModuleLinker): js.promise.Promise<js.core.Void>

    @seskar.js.JsAsync
    suspend fun link(linker: ModuleLinker): js.core.Void
}
