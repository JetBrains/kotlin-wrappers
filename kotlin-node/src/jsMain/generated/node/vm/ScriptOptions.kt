// Automatically generated - do not modify!

package node.vm

sealed external interface ScriptOptions : BaseOptions {
    /**
     * V8's code cache data for the supplied source.
     */
    var cachedData: Any? /* Buffer | NodeJS.ArrayBufferView */

    /** @deprecated in favor of `script.createCachedData()` */
    var produceCachedData: Boolean?

    /**
     * Called during evaluation of this module when `import()` is called.
     * If this option is not specified, calls to `import()` will reject with `ERR_VM_DYNAMIC_IMPORT_CALLBACK_MISSING`.
     */
    var importModuleDynamically: (((specifier: String, script: Script, importAssertions: Any) -> Module))?
}
