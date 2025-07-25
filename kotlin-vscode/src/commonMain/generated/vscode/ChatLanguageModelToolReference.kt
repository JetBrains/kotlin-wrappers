// Automatically generated - do not modify!

package vscode

import js.array.Tuple2
import js.core.JsInt

/**
 * A reference to a tool that the user manually attached to their request, either using the `#`-syntax inline, or as an
 * attachment via the paperclip button.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatLanguageModelToolReference)
 */
external interface ChatLanguageModelToolReference {
    /**
     * The tool name. Refers to a tool listed in [lm.tools].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatLanguageModelToolReference.name)
     */
    val name: String

    /**
     * The start and end index of the reference in the [prompt][ChatRequest.prompt]. When undefined, the reference was
     * not part of the prompt text.
     *
     * *Note* that the indices take the leading `#`-character into account which means they can be used to modify the prompt
     * as-is.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatLanguageModelToolReference.range)
     */
    val range: Tuple2</* start */ JsInt, /* end */ JsInt>?
}
