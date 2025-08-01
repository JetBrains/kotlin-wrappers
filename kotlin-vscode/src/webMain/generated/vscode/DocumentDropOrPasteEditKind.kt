// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule

/**
 * Identifies a {@linkcode DocumentDropEdit} or {@linkcode DocumentPasteEdit}
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind)
 */
open external class DocumentDropOrPasteEditKind {
    /**
     * Use {@linkcode DocumentDropOrPasteEditKind.Empty} instead.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.constructor)
     */
    private constructor(value: String)

    /**
     * The raw string value of the kind.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.value)
     */
    val value: String

    /**
     * Create a new kind by appending additional scopes to the current kind.
     *
     * Does not modify the current kind.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.append)
     */
    fun append(vararg parts: String): DocumentDropOrPasteEditKind

    /**
     * Checks if this kind intersects `other`.
     *
     * The kind `"text.plain"` for example intersects `text`, `"text.plain"` and `"text.plain.list"`,
     * but not `"unicorn"`, or `"textUnicorn.plain"`.
     *
     * @param other Kind to check.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.intersects)
     */
    fun intersects(other: DocumentDropOrPasteEditKind): Boolean

    /**
     * Checks if `other` is a sub-kind of this `DocumentDropOrPasteEditKind`.
     *
     * The kind `"text.plain"` for example contains `"text.plain"` and `"text.plain.list"`,
     * but not `"text"` or `"unicorn.text.plain"`.
     *
     * @param other Kind to check.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.contains)
     */
    fun contains(other: DocumentDropOrPasteEditKind): Boolean

    companion object {
        val Empty: DocumentDropOrPasteEditKind

        /**
         * The root kind for basic text edits.
         *
         * This kind should be used for edits that insert basic text into the document. A good example of this is
         * an edit that pastes the clipboard text while also updating imports in the file based on the pasted text.
         * For this we could use a kind such as `text.updateImports.someLanguageId`.
         *
         * Even though most drop/paste edits ultimately insert text, you should not use {@linkcode Text} as the base kind
         * for every edit as this is redundant. Instead a more specific kind that describes the type of content being
         * inserted should be used instead. For example, if the edit adds a Markdown link, use `markdown.link` since even
         * though the content being inserted is text, it's more important to know that the edit inserts Markdown syntax.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.Text)
         */
        val Text: DocumentDropOrPasteEditKind

        /**
         * Root kind for edits that update imports in a document in addition to inserting text.
         *
         * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentDropOrPasteEditKind.TextUpdateImports)
         */
        val TextUpdateImports: DocumentDropOrPasteEditKind
    }
}
