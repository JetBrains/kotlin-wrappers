// Automatically generated - do not modify!

package vscode

import kotlinx.js.JsPlainObject
import kotlin.js.JsAny

/**
 * A tool that is available to the language model via [LanguageModelChatRequestOptions]. A language model uses all the
 * properties of this interface to decide which tool to call, and how to call it.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatTool)
 */
@JsPlainObject
external interface LanguageModelChatTool {
    /**
     * The name of the tool.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatTool.name)
     */
    var name: String

    /**
     * The description of the tool.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatTool.description)
     */
    var description: String

    /**
     * A JSON schema for the input this tool accepts.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelChatTool.inputSchema)
     */
    var inputSchema: JsAny?
}
