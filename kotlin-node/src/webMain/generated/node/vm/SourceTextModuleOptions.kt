// Automatically generated - do not modify!

package node.vm

sealed external interface SourceTextModuleOptions : ScriptOptions {
    /**
     * String used in stack traces.
     * @default 'vm:module(i)' where i is a context-specific ascending index.
     */
    var identifier: String?
    var context: Context?

    /**
     * Called during evaluation of this module to initialize the `import.meta`.
     */
    var initializeImportMeta: ((meta: js.import.ImportMeta, module: SourceTextModule) -> Unit)?

    /**
     * Used to specify how the modules should be loaded during the evaluation of this script when `import()` is called. This option is
     * part of the experimental modules API. We do not recommend using it in a production environment. For detailed information, see
     * [Support of dynamic `import()` in compilation APIs](https://nodejs.org/docs/latest-v24.x/api/vm.html#support-of-dynamic-import-in-compilation-apis).
     * @experimental
     */
    @JsName("importModuleDynamically")
    var sourceTextImportModuleDynamically: DynamicModuleLoader<SourceTextModule>?
}
