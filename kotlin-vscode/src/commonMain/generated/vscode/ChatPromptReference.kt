// Automatically generated - do not modify!

package vscode

import js.array.Tuple2
import js.core.JsAny
import js.core.JsInt

/**
 * A reference to a value that the user added to their chat request.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatPromptReference)
 */
external interface ChatPromptReference {
    /**
     * A unique identifier for this kind of reference.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatPromptReference.id)
     */
    val id: String

    /**
     * The start and end index of the reference in the [prompt][ChatRequest.prompt]. When undefined, the reference was not part of the prompt text.
     *
     * *Note* that the indices take the leading `#`-character into account which means they can
     * used to modify the prompt as-is.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatPromptReference.range)
     */
    val range: Tuple2</* start */ JsInt, /* end */ JsInt>?

    /**
     * A description of this value that could be used in an LLM prompt.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatPromptReference.modelDescription)
     */
    val modelDescription: String?

    /**
     * The value of this reference. The `string | Uri | Location` types are used today, but this could expand in the future.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatPromptReference.value)
     */
    val value: JsAny /* string | Uri | Location | unknown */
}
