// Automatically generated - do not modify!

package vscode

import js.array.Tuple2
import js.core.JsAny
import js.core.JsInt

/**
 * A reference to a value that the user added to their chat request.
 */
external interface ChatPromptReference {
    /**
     * A unique identifier for this kind of reference.
     */
    val id: String

    /**
     * The start and end index of the reference in the {@link ChatRequest.prompt prompt}. When undefined, the reference was not part of the prompt text.
     *
     * *Note* that the indices take the leading `#`-character into account which means they can
     * used to modify the prompt as-is.
     */
    val range: Tuple2</* start */ JsInt, /* end */ JsInt>?

    /**
     * A description of this value that could be used in an LLM prompt.
     */
    val modelDescription: String?

    /**
     * The value of this reference. The `string | Uri | Location` types are used today, but this could expand in the future.
     */
    val value: JsAny /* string | Uri | Location | unknown */
}
