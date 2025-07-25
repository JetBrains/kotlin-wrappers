// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Namespace for source control management.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#scm)
 */
external object scm {
    /**
     * Creates a new [source control][SourceControl] instance.
     *
     * @param id An `id` for the source control. Something short, e.g.: `git`.
     * @param label A human-readable string for the source control. E.g.: `Git`.
     * @param rootUri An optional Uri of the root of the source control. E.g.: `Uri.parse(workspaceRoot)`.
     * @returns An instance of [source control][SourceControl].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#scm.createSourceControl)
     */
    fun createSourceControl(
        id: String,
        label: String,
        rootUri: Uri = definedExternally,
    ): SourceControl
}
