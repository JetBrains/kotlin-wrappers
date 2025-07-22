// Automatically generated - do not modify!

package vscode

/**
 * The ChatResponseStream is how a participant is able to return content to the chat view. It provides several methods for streaming different types of content
 * which will be rendered in an appropriate way in the chat view. A participant can use the helper method for the type of content it wants to return, or it
 * can instantiate a {@link ChatResponsePart} and use the generic {@link ChatResponseStream.push} method to return it.
 */
external interface ChatResponseStream {
    /**
    // ORIGINAL SOURCE

    /**
     * Push a markdown part to this stream. Short-hand for
     * `push(new ChatResponseMarkdownPart(value))`.
     *
     * @see {@link ChatResponseStream.push}
     * @param value A markdown string or a string that should be interpreted as markdown. The boolean form of {@link MarkdownString.isTrusted} is NOT supported.
    */
    markdown(value: string | MarkdownString): void;

    /**
     * Push an anchor part to this stream. Short-hand for
     * `push(new ChatResponseAnchorPart(value, title))`.
     * An anchor is an inline reference to some type of resource.
     *
     * @param value A uri or location.
     * @param title An optional title that is rendered with value.
    */
    anchor(value: Uri | Location, title?: string): void;

    /**
     * Push a command button part to this stream. Short-hand for
     * `push(new ChatResponseCommandButtonPart(value, title))`.
     *
     * @param command A Command that will be executed when the button is clicked.
    */
    button(command: Command): void;

    /**
     * Push a filetree part to this stream. Short-hand for
     * `push(new ChatResponseFileTreePart(value))`.
     *
     * @param value File tree data.
     * @param baseUri The base uri to which this file tree is relative.
    */
    filetree(value: ChatResponseFileTree[], baseUri: Uri): void;

    /**
     * Push a progress part to this stream. Short-hand for
     * `push(new ChatResponseProgressPart(value))`.
     *
     * @param value A progress message
    */
    progress(value: string): void;

    /**
     * Push a reference to this stream. Short-hand for
     * `push(new ChatResponseReferencePart(value))`.
     *
     * *Note* that the reference is not rendered inline with the response.
     *
     * @param value A uri or location
     * @param iconPath Icon for the reference shown in UI
    */
    reference(value: Uri | Location, iconPath?: IconPath): void;

    /**
     * Pushes a part to this stream.
     *
     * @param part A response part, rendered or metadata
    */
    push(part: ChatResponsePart): void;

    // ORIGINAL SOURCE
     **/
}
