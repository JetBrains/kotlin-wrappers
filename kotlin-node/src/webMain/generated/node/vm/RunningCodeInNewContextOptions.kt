// Automatically generated - do not modify!

package node.vm

sealed external interface RunningCodeInNewContextOptions :
    RunningScriptInNewContextOptions,
    ScriptOptions {
    /**
     * Used to specify how the modules should be loaded during the evaluation of this script when `import()` is called. This option is
     * part of the experimental modules API. We do not recommend using it in a production environment. For detailed information, see
     * [Support of dynamic `import()` in compilation APIs](https://nodejs.org/docs/latest-v24.x/api/vm.html#support-of-dynamic-import-in-compilation-apis).
     * @experimental
     */
    override var importModuleDynamically: Any? // DynamicModuleLoader<Script> | typeof constants.USE_MAIN_CONTEXT_DEFAULT_LOADER | undefined
}
