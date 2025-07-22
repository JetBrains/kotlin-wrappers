// Automatically generated - do not modify!

package vscode

/**
 * A tool that is available to the language model via {@link LanguageModelChatRequestOptions}. A language model uses all the
 * properties of this interface to decide which tool to call, and how to call it.
 */
external interface LanguageModelChatTool {
    /**
    // ORIGINAL SOURCE

    /**
     * The name of the tool.
    */
    name: string;

    /**
     * The description of the tool.
    */
    description: string;

    /**
     * A JSON schema for the input this tool accepts.
    */
    inputSchema?: object | undefined;

    // ORIGINAL SOURCE
     **/
}
