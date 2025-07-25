// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.objects.JsPlainObject

/**
 * Information about a registered tool available in [lm.tools].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolInformation)
 */
@JsPlainObject
external interface LanguageModelToolInformation {
    /**
     * A unique name for the tool.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolInformation.name)
     */
    val name: String

    /**
     * A description of this tool that may be passed to a language model.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolInformation.description)
     */
    val description: String

    /**
     * A JSON schema for the input this tool accepts.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolInformation.inputSchema)
     */
    val inputSchema: JsAny?

    /**
     * A set of tags, declared by the tool, that roughly describe the tool's capabilities. A tool user may use these to filter
     * the set of tools to just ones that are relevant for the task at hand.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#LanguageModelToolInformation.tags)
     */
    val tags: ReadonlyArray<JsString>
}
