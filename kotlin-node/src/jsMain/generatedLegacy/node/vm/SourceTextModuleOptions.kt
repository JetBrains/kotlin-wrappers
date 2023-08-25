// Automatically generated - do not modify!

package node.vm

import js.import.ImportMeta

sealed external interface SourceTextModuleOptions {
    /**
     * String used in stack traces.
     * @default 'vm:module(i)' where i is a context-specific ascending index.
     */
    var identifier: String?
    var cachedData: Any? /* ScriptOptions['cachedData'] */
    var context: Context?
    var lineOffset: Number? /* BaseOptions['lineOffset'] */
    var columnOffset: Number? /* BaseOptions['columnOffset'] */

    /**
     * Called during evaluation of this module to initialize the `import.meta`.
     */
    var initializeImportMeta: (((meta: ImportMeta, module: SourceTextModule) -> Unit))?
    var importModuleDynamically: ((specifier: String, script: Script, importAssertions: Any) -> Module /* ScriptOptions['importModuleDynamically'] */)?
}
