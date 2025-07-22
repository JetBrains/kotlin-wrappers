// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Identifies a {@linkcode DocumentDropEdit} or {@linkcode DocumentPasteEdit}
 */
open external class DocumentDropOrPasteEditKind {
//  static readonly Empty: DocumentDropOrPasteEditKind;

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
     */
//  static readonly Text: DocumentDropOrPasteEditKind;

    /**
     * Root kind for edits that update imports in a document in addition to inserting text.
     */
//  static readonly TextUpdateImports: DocumentDropOrPasteEditKind;

    /**
     * Use {@linkcode DocumentDropOrPasteEditKind.Empty} instead.
     */
//  private constructor(value: string);

    /**
     * The raw string value of the kind.
     */
//  readonly value: string;

    /**
     * Create a new kind by appending additional scopes to the current kind.
     *
     * Does not modify the current kind.
     */
//  append(...parts: string[]): DocumentDropOrPasteEditKind;

    /**
     * Checks if this kind intersects `other`.
     *
     * The kind `"text.plain"` for example intersects `text`, `"text.plain"` and `"text.plain.list"`,
     * but not `"unicorn"`, or `"textUnicorn.plain"`.
     *
     * @param other Kind to check.
     */
//  intersects(other: DocumentDropOrPasteEditKind): boolean;

    /**
     * Checks if `other` is a sub-kind of this `DocumentDropOrPasteEditKind`.
     *
     * The kind `"text.plain"` for example contains `"text.plain"` and `"text.plain.list"`,
     * but not `"text"` or `"unicorn.text.plain"`.
     *
     * @param other Kind to check.
     */
//  contains(other: DocumentDropOrPasteEditKind): boolean;
}
