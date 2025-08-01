// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An source control is able to provide [resource states][SourceControlResourceState]
 * to the editor and interact with the editor in several source control related ways.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl)
 */
external interface SourceControl :
    DisposableLike {
    /**
     * The id of this source control.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.id)
     */
    val id: String

    /**
     * The human-readable label of this source control.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.label)
     */
    val label: String

    /**
     * The (optional) Uri of the root of this source control.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.rootUri)
     */
    val rootUri: Uri?

    /**
     * The [input box][SourceControlInputBox] for this source control.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.inputBox)
     */
    val inputBox: SourceControlInputBox

    /**
     * The UI-visible count of [resource states][SourceControlResourceState] of
     * this source control.
     *
     * If undefined, this source control will
     * - display its UI-visible count as zero, and
     * - contribute the count of its [resource states][SourceControlResourceState] to the UI-visible aggregated count for all source controls
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.count)
     */
    var count: Int?

    /**
     * An optional [quick diff provider][QuickDiffProvider].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.quickDiffProvider)
     */
    var quickDiffProvider: QuickDiffProvider?

    /**
     * Optional commit template string.
     *
     * The Source Control viewlet will populate the Source Control
     * input with this value when appropriate.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.commitTemplate)
     */
    var commitTemplate: String?

    /**
     * Optional accept input command.
     *
     * This command will be invoked when the user accepts the value
     * in the Source Control input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.acceptInputCommand)
     */
    var acceptInputCommand: Command?

    /**
     * Optional status bar commands.
     *
     * These commands will be displayed in the editor's status bar.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.statusBarCommands)
     */
    var statusBarCommands: ReadonlyArray<Command>?

    /**
     * Create a new [resource group][SourceControlResourceGroup].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.createResourceGroup)
     */
    fun createResourceGroup(
        id: String,
        label: String,
    ): SourceControlResourceGroup

    /**
     * Dispose this source control.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SourceControl.dispose)
     */
    override fun dispose()
}
