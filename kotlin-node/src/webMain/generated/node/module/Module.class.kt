// Automatically generated - do not modify!

@file:JsModule("node:module")

package node.module

external class Module {
    constructor (id: String, parent: Module = definedExternally)
// Module

    /**
     * The module objects required for the first time by this one.
     * @since v0.1.16
     */
    var children: js.array.ReadonlyArray<Module>

    /**
     * The `module.exports` object is created by the `Module` system. Sometimes this is
     * not acceptable; many want their module to be an instance of some class. To do
     * this, assign the desired export object to `module.exports`.
     * @since v0.1.16
     */
    var exports: Any?

    /**
     * The fully resolved filename of the module.
     * @since v0.1.16
     */
    var filename: String

    /**
     * The identifier for the module. Typically this is the fully resolved
     * filename.
     * @since v0.1.16
     */
    var id: String

    /**
     * `true` if the module is running during the Node.js preload
     * phase.
     * @since v15.4.0, v14.17.0
     */
    var isPreloading: Boolean

    /**
     * Whether or not the module is done loading, or is in the process of
     * loading.
     * @since v0.1.16
     */
    var loaded: Boolean

    /**
     * The module that first required this one, or `null` if the current module is the
     * entry point of the current process, or `undefined` if the module was loaded by
     * something that is not a CommonJS module (e.g. REPL or `import`).
     * @since v0.1.16
     * @deprecated Please use `require.main` and `module.children` instead.
     */
    var parent: Module?

    /**
     * The directory name of the module. This is usually the same as the
     * `path.dirname()` of the `module.id`.
     * @since v11.14.0
     */
    var path: String

    /**
     * The search paths for the module.
     * @since v0.4.0
     */
    var paths: js.array.ReadonlyArray<String>

    /**
     * The `module.require()` method provides a way to load a module as if
     * `require()` was called from the original module.
     * @since v0.5.1
     */
    fun require(id: String): Any?
}
