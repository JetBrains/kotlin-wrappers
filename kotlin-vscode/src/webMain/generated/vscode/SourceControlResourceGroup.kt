// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * A source control resource group is a collection of
 * [source control resource states][SourceControlResourceState].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup)
 */
external interface SourceControlResourceGroup :
    DisposableLike {
    /**
     * The id of this source control resource group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup.id)
     */
    val id: String

    /**
     * The label of this source control resource group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup.label)
     */
    var label: String

    /**
     * Whether this source control resource group is hidden when it contains
     * no [source control resource states][SourceControlResourceState].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup.hideWhenEmpty)
     */
    var hideWhenEmpty: Boolean?

    /**
     * Context value of the resource group. This can be used to contribute resource group specific actions.
     * For example, if a resource group is given a context value of `exportable`, when contributing actions to `scm/resourceGroup/context`
     * using `menus` extension point, you can specify context value for key `scmResourceGroupState` in `when` expressions, like `scmResourceGroupState == exportable`.
     * ```json
     * "contributes": {
     *   "menus": {
     *     "scm/resourceGroup/context": [
     *       {
     *         "command": "extension.export",
     *         "when": "scmResourceGroupState == exportable"
     *       }
     *     ]
     *   }
     * }
     * ```
     * This will show action `extension.export` only for resource groups with `contextValue` equal to `exportable`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup.contextValue)
     */
    var contextValue: String?

    /**
     * This group's collection of
     * [source control resource states][SourceControlResourceState].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup.resourceStates)
     */
    var resourceStates: ReadonlyArray<SourceControlResourceState>

    /**
     * Dispose this source control resource group.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControlResourceGroup.dispose)
     */
    override fun dispose()
}
