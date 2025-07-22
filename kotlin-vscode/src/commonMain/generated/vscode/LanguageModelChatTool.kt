// Automatically generated - do not modify!

package vscode

/**
 * A tool that is available to the language model via {@link LanguageModelChatRequestOptions}. A language model uses all the
 * properties of this interface to decide which tool to call, and how to call it.
 */
external interface LanguageModelChatTool {
    /**
     * The name of the tool.
     */
    var name: String

    /**
     * The description of the tool.
     */
    var description: String

    /**
     * A JSON schema for the input this tool accepts.
     */
    var inputSchema: Any?
}
