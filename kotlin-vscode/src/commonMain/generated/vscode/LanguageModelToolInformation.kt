// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString

/**
 * Information about a registered tool available in [lm.tools].
 */
external interface LanguageModelToolInformation {
    /**
     * A unique name for the tool.
     */
    val name: String

    /**
     * A description of this tool that may be passed to a language model.
     */
    val description: String

    /**
     * A JSON schema for the input this tool accepts.
     */
    val inputSchema: JsAny?

    /**
     * A set of tags, declared by the tool, that roughly describe the tool's capabilities. A tool user may use these to filter
     * the set of tools to just ones that are relevant for the task at hand.
     */
    val tags: ReadonlyArray<JsString>
}
