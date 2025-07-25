// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * An source control resource state represents the state of an underlying workspace
 * resource within a certain [source control group][SourceControlResourceGroup].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceState)
 */
@JsPlainObject
external interface SourceControlResourceState {
    /**
     * The [Uri] of the underlying resource inside the workspace.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceState.resourceUri)
     */
    val resourceUri: Uri

    /**
     * The [Command] which should be run when the resource
     * state is open in the Source Control viewlet.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceState.command)
     */
    val command: Command?

    /**
     * The [decorations][SourceControlResourceDecorations] for this source control
     * resource state.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceState.decorations)
     */
    val decorations: SourceControlResourceDecorations?

    /**
     * Context value of the resource state. This can be used to contribute resource specific actions.
     * For example, if a resource is given a context value as `diffable`. When contributing actions to `scm/resourceState/context`
     * using `menus` extension point, you can specify context value for key `scmResourceState` in `when` expressions, like `scmResourceState == diffable`.
     * ```json
     * "contributes": {
     *   "menus": {
     *     "scm/resourceState/context": [
     *       {
     *         "command": "extension.diff",
     *         "when": "scmResourceState == diffable"
     *       }
     *     ]
     *   }
     * }
     * ```
     * This will show action `extension.diff` only for resources with `contextValue` is `diffable`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceState.contextValue)
     */
    val contextValue: String?
}
