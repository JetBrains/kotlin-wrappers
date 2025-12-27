// Automatically generated - do not modify!

package electron.core

external interface PreloadScript {
// Docs: https://electronjs.org/docs/api/structures/preload-script
    /**
     * Path of the script file. Must be an absolute path.
     */
    var filePath: String

    /**
     * Unique ID of preload script.
     */
    var id: String

    /**
     * Context type where the preload script will be executed. Possible values include
     * `frame` or `service-worker`.
     */
    var type: (PreloadScriptType)
}
