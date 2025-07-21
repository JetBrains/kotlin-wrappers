// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * An source control is able to provide {@link SourceControlResourceState resource states}
 * to the editor and interact with the editor in several source control related ways.
*/
export interface SourceControl {

/**
 * The id of this source control.
*/
readonly id: string;

/**
 * The human-readable label of this source control.
*/
readonly label: string;

/**
 * The (optional) Uri of the root of this source control.
*/
readonly rootUri: Uri | undefined;

/**
 * The {@link SourceControlInputBox input box} for this source control.
*/
readonly inputBox: SourceControlInputBox;

/**
 * The UI-visible count of {@link SourceControlResourceState resource states} of
 * this source control.
 *
 * If undefined, this source control will
 * - display its UI-visible count as zero, and
 * - contribute the count of its {@link SourceControlResourceState resource states} to the UI-visible aggregated count for all source controls
*/
count?: number;

/**
 * An optional {@link QuickDiffProvider quick diff provider}.
*/
quickDiffProvider?: QuickDiffProvider;

/**
 * Optional commit template string.
 *
 * The Source Control viewlet will populate the Source Control
 * input with this value when appropriate.
*/
commitTemplate?: string;

/**
 * Optional accept input command.
 *
 * This command will be invoked when the user accepts the value
 * in the Source Control input.
*/
acceptInputCommand?: Command;

/**
 * Optional status bar commands.
 *
 * These commands will be displayed in the editor's status bar.
*/
statusBarCommands?: Command[];

/**
 * Create a new {@link SourceControlResourceGroup resource group}.
*/
createResourceGroup(id: string, label: string): SourceControlResourceGroup;

/**
 * Dispose this source control.
*/
dispose(): void;
}

// ORIGINAL SOURCE
 **/
