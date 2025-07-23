// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Namespace for source control management.
 */
external object scm {
    /**
     * Creates a new {@link SourceControl source control} instance.
     *
     * @param id An `id` for the source control. Something short, e.g.: `git`.
     * @param label A human-readable string for the source control. E.g.: `Git`.
     * @param rootUri An optional Uri of the root of the source control. E.g.: `Uri.parse(workspaceRoot)`.
     * @returns An instance of {@link SourceControl source control}.
     */
    fun createSourceControl(
        id: String,
        label: String,
        rootUri: Uri = definedExternally,
    ): SourceControl
}
