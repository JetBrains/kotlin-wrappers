// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import kotlin.js.definedExternally

/**
 * The ChatResponseStream is how a participant is able to return content to the chat view. It provides several methods for streaming different types of content
 * which will be rendered in an appropriate way in the chat view. A participant can use the helper method for the type of content it wants to return, or it
 * can instantiate a [ChatResponsePart] and use the generic {@link ChatResponseStream.push} method to return it.
 */
external interface ChatResponseStream {
    /**
     * Push a markdown part to this stream. Short-hand for
     * `push(new ChatResponseMarkdownPart(value))`.
     *
     * @see {@link ChatResponseStream.push}
     * @param value A markdown string or a string that should be interpreted as markdown. The boolean form of {@link MarkdownString.isTrusted} is NOT supported.
     */
    fun markdown(value: JsAny /* string | MarkdownString */)

    /**
     * Push an anchor part to this stream. Short-hand for
     * `push(new ChatResponseAnchorPart(value, title))`.
     * An anchor is an inline reference to some type of resource.
     *
     * @param value A uri or location.
     * @param title An optional title that is rendered with value.
     */
    fun anchor(
        value: JsAny, /* Uri | Location */
        title: String = definedExternally,
    )

    /**
     * Push a command button part to this stream. Short-hand for
     * `push(new ChatResponseCommandButtonPart(value, title))`.
     *
     * @param command A Command that will be executed when the button is clicked.
     */
    fun button(command: Command)

    /**
     * Push a filetree part to this stream. Short-hand for
     * `push(new ChatResponseFileTreePart(value))`.
     *
     * @param value File tree data.
     * @param baseUri The base uri to which this file tree is relative.
     */
    fun filetree(
        value: ReadonlyArray<ChatResponseFileTree>,
        baseUri: Uri,
    )

    /**
     * Push a progress part to this stream. Short-hand for
     * `push(new ChatResponseProgressPart(value))`.
     *
     * @param value A progress message
     */
    fun progress(value: String)

    /**
     * Push a reference to this stream. Short-hand for
     * `push(new ChatResponseReferencePart(value))`.
     *
     * *Note* that the reference is not rendered inline with the response.
     *
     * @param value A uri or location
     * @param iconPath Icon for the reference shown in UI
     */
    fun reference(
        value: JsAny, /* Uri | Location */
        iconPath: IconPath = definedExternally,
    )

    /**
     * Pushes a part to this stream.
     *
     * @param part A response part, rendered or metadata
     */
    fun push(part: ChatResponsePart)
}
