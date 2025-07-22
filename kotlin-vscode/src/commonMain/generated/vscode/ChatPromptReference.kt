// Automatically generated - do not modify!

package vscode

/**
 * A reference to a value that the user added to their chat request.
 */
external interface ChatPromptReference {
    /**
    // ORIGINAL SOURCE

    /**
     * A unique identifier for this kind of reference.
    */
    readonly id: string;

    /**
     * The start and end index of the reference in the {@link ChatRequest.prompt prompt}. When undefined, the reference was not part of the prompt text.
     *
     * *Note* that the indices take the leading `#`-character into account which means they can
     * used to modify the prompt as-is.
    */
    readonly range?: [start: number, end: number];

    /**
     * A description of this value that could be used in an LLM prompt.
    */
    readonly modelDescription?: string;

    /**
     * The value of this reference. The `string | Uri | Location` types are used today, but this could expand in the future.
    */
    readonly value: string | Uri | Location | unknown;

    // ORIGINAL SOURCE
     **/
}
