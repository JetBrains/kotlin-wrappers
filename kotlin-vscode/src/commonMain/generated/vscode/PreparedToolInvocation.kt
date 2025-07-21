// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * The result of a call to {@link LanguageModelTool.prepareInvocation}.
*/
export interface PreparedToolInvocation {
/**
 * A customized progress message to show while the tool runs.
*/
invocationMessage?: string | MarkdownString;

/**
 * The presence of this property indicates that the user should be asked to confirm before running the tool. The user
 * should be asked for confirmation for any tool that has a side-effect or may potentially be dangerous.
*/
confirmationMessages?: LanguageModelToolConfirmationMessages;
}

// ORIGINAL SOURCE
 **/
