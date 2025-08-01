// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.core.JsAny
import kotlin.js.JsModule

/**
 * Represents a part of a chat response that is formatted as Markdown.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseMarkdownPart)
 */
open external class ChatResponseMarkdownPart {
    /**
     * A markdown string or a string that should be interpreted as markdown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseMarkdownPart.value)
     */
    var value: MarkdownString

    /**
     * Create a new ChatResponseMarkdownPart.
     *
     * @param value A markdown string or a string that should be interpreted as markdown. The boolean form of [MarkdownString.isTrusted] is NOT supported.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ChatResponseMarkdownPart.constructor)
     */
    constructor(value: JsAny /* string | MarkdownString */)
}
