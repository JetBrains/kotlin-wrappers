// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * Information about a registered tool available in {@link lm.tools}.
*/
export interface LanguageModelToolInformation {
/**
 * A unique name for the tool.
*/
readonly name: string;

/**
 * A description of this tool that may be passed to a language model.
*/
readonly description: string;

/**
 * A JSON schema for the input this tool accepts.
*/
readonly inputSchema: object | undefined;

/**
 * A set of tags, declared by the tool, that roughly describe the tool's capabilities. A tool user may use these to filter
 * the set of tools to just ones that are relevant for the task at hand.
*/
readonly tags: readonly string[];
}

// ORIGINAL SOURCE
 **/
