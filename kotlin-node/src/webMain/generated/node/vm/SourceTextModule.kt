// Automatically generated - do not modify!

@file:JsModule("node:vm")

package node.vm

/**
 * This feature is only available with the `--experimental-vm-modules` command
 * flag enabled.
 *
 * The `vm.SourceTextModule` class provides the [Source Text Module Record](https://tc39.es/ecma262/#sec-source-text-module-records) as
 * defined in the ECMAScript specification.
 * @since v9.6.0
 * @experimental
 */
external class SourceTextModule : Module {
    /**
     * Creates a new `SourceTextModule` instance.
     *
     * Properties assigned to the `import.meta` object that are objects may
     * allow the module to access information outside the specified `context`. Use
     * `vm.runInContext()` to create objects in a specific context.
     *
     * ```js
     * import vm from 'node:vm';
     *
     * const contextifiedObject = vm.createContext({ secret: 42 });
     *
     * const module = new vm.SourceTextModule(
     *   'Object.getPrototypeOf(import.meta.prop).secret = secret;',
     *   {
     *     initializeImportMeta(meta) {
     *       // Note: this object is created in the top context. As such,
     *       // Object.getPrototypeOf(import.meta.prop) points to the
     *       // Object.prototype in the top context rather than that in
     *       // the contextified object.
     *       meta.prop = {};
     *     },
     *   });
     * // The module has an empty `moduleRequests` array.
     * module.linkRequests([]);
     * module.instantiate();
     * await module.evaluate();
     *
     * // Now, Object.prototype.secret will be equal to 42.
     * //
     * // To fix this problem, replace
     * //     meta.prop = {};
     * // above with
     * //     meta.prop = vm.runInContext('{}', contextifiedObject);
     * ```
     * @param code JavaScript Module code to parse
     */
    constructor (code: String, options: SourceTextModuleOptions = definedExternally)

    /**
     * @deprecated Use `sourceTextModule.moduleRequests` instead.
     */
    val dependencySpecifiers: js.array.ReadonlyArray<String>

    /**
     * Iterates over the dependency graph and returns `true` if any module in its
     * dependencies or this module itself contains top-level `await` expressions,
     * otherwise returns `false`.
     *
     * The search may be slow if the graph is big enough.
     *
     * This requires the module to be instantiated first. If the module is not
     * instantiated yet, an error will be thrown.
     * @since v24.9.0
     */
    fun hasAsyncGraph(): Boolean

    /**
     * Returns whether the module itself contains any top-level `await` expressions.
     *
     * This corresponds to the field `[[HasTLA]]` in [Cyclic Module Record](https://tc39.es/ecma262/#sec-cyclic-module-records) in the
     * ECMAScript specification.
     * @since v24.9.0
     */
    fun hasTopLevelAwait(): Boolean

    /**
     * Instantiate the module with the linked requested modules.
     *
     * This resolves the imported bindings of the module, including re-exported
     * binding names. When there are any bindings that cannot be resolved,
     * an error would be thrown synchronously.
     *
     * If the requested modules include cyclic dependencies, the
     * `sourceTextModule.linkRequests(modules)` method must be called on all
     * modules in the cycle before calling this method.
     * @since v24.8.0
     */
    fun instantiate()

    /**
     * Link module dependencies. This method must be called before evaluation, and
     * can only be called once per module.
     *
     * The order of the module instances in the `modules` array should correspond to the order of
     * `sourceTextModule.moduleRequests` being resolved. If two module requests have the same
     * specifier and import attributes, they must be resolved with the same module instance or an
     * `ERR_MODULE_LINK_MISMATCH` would be thrown. For example, when linking requests for this
     * module:
     *
     * ```js
     * import foo from 'foo';
     * import source Foo from 'foo';
     * ```
     *
     * The `modules` array must contain two references to the same instance, because the two
     * module requests are identical but in two phases.
     *
     * If the module has no dependencies, the `modules` array can be empty.
     *
     * Users can use `sourceTextModule.moduleRequests` to implement the host-defined
     * [HostLoadImportedModule](https://tc39.es/ecma262/#sec-HostLoadImportedModule) abstract operation in the ECMAScript specification,
     * and using `sourceTextModule.linkRequests()` to invoke specification defined
     * [FinishLoadingImportedModule](https://tc39.es/ecma262/#sec-FinishLoadingImportedModule), on the module with all dependencies in a batch.
     *
     * It's up to the creator of the `SourceTextModule` to determine if the resolution
     * of the dependencies is synchronous or asynchronous.
     *
     * After each module in the `modules` array is linked, call
     * `sourceTextModule.instantiate()`.
     * @since v24.8.0
     * @param modules Array of `vm.Module` objects that this module depends on.
     * The order of the modules in the array is the order of
     * `sourceTextModule.moduleRequests`.
     */
    fun linkRequests(modules: js.array.ReadonlyArray<Module>)

    /**
     * The requested import dependencies of this module. The returned array is frozen
     * to disallow any changes to it.
     *
     * For example, given a source text:
     *
     * ```js
     * import foo from 'foo';
     * import fooAlias from 'foo';
     * import bar from './bar.js';
     * import withAttrs from '../with-attrs.ts' with { arbitraryAttr: 'attr-val' };
     * import source Module from 'wasm-mod.wasm';
     * ```
     *
     * The value of the `sourceTextModule.moduleRequests` will be:
     *
     * ```js
     * [
     *   {
     *     specifier: 'foo',
     *     attributes: {},
     *     phase: 'evaluation',
     *   },
     *   {
     *     specifier: 'foo',
     *     attributes: {},
     *     phase: 'evaluation',
     *   },
     *   {
     *     specifier: './bar.js',
     *     attributes: {},
     *     phase: 'evaluation',
     *   },
     *   {
     *     specifier: '../with-attrs.ts',
     *     attributes: { arbitraryAttr: 'attr-val' },
     *     phase: 'evaluation',
     *   },
     *   {
     *     specifier: 'wasm-mod.wasm',
     *     attributes: {},
     *     phase: 'source',
     *   },
     * ];
     * ```
     * @since v24.4.0
     */
    val moduleRequests: js.array.ReadonlyArray<ModuleRequest>
}
