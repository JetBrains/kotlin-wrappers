// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * Represents a part of a chat response that is formatted as Markdown.
 */
open external class ChatResponseMarkdownPart {
    /**
     * A markdown string or a string that should be interpreted as markdown.
     */
    var value: MarkdownString

    /**
     * Create a new ChatResponseMarkdownPart.
     *
     * @param value A markdown string or a string that should be interpreted as markdown. The boolean form of {@link MarkdownString.isTrusted} is NOT supported.
     */
    constructor(value: JsAny /* string | MarkdownString */)
}
