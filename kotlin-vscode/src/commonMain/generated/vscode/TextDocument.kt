// Automatically generated - do not modify!

package vscode

/**
 * Represents a text document, such as a source file. Text documents have
 * {@link TextLine lines} and knowledge about an underlying resource like a file.
 */
external interface TextDocument {
    /**
     * The associated uri for this document.
     *
     * *Note* that most documents use the `file`-scheme, which means they are files on disk. However, **not** all documents are
     * saved on disk and therefore the `scheme` must be checked before trying to access the underlying file or siblings on disk.
     *
     * @see {@link FileSystemProvider}
     * @see {@link TextDocumentContentProvider}
     */
    val uri: Uri

    /**
     * The file system path of the associated resource. Shorthand
     * notation for {@link TextDocument.uri TextDocument.uri.fsPath}. Independent of the uri scheme.
     */
    val fileName: String

    /**
     * Is this document representing an untitled file which has never been saved yet. *Note* that
     * this does not mean the document will be saved to disk, use {@linkcode Uri.scheme}
     * to figure out where a document will be {@link FileSystemProvider saved}, e.g. `file`, `ftp` etc.
     */
    val isUntitled: Boolean

    /**
     * The identifier of the language associated with this document.
     */
    val languageId: String

    /**
     * The file encoding of this document that will be used when the document is saved.
     *
     * Use the {@link workspace.onDidChangeTextDocument onDidChangeTextDocument}-event to
     * get notified when the document encoding changes.
     *
     * Note that the possible encoding values are currently defined as any of the following:
     * 'utf8', 'utf8bom', 'utf16le', 'utf16be', 'windows1252', 'iso88591', 'iso88593',
     * 'iso885915', 'macroman', 'cp437', 'windows1256', 'iso88596', 'windows1257',
     * 'iso88594', 'iso885914', 'windows1250', 'iso88592', 'cp852', 'windows1251',
     * 'cp866', 'cp1125', 'iso88595', 'koi8r', 'koi8u', 'iso885913', 'windows1253',
     * 'iso88597', 'windows1255', 'iso88598', 'iso885910', 'iso885916', 'windows1254',
     * 'iso88599', 'windows1258', 'gbk', 'gb18030', 'cp950', 'big5hkscs', 'shiftjis',
     * 'eucjp', 'euckr', 'windows874', 'iso885911', 'koi8ru', 'koi8t', 'gb2312',
     * 'cp865', 'cp850'.
     */
    val encoding: String

    /**
     * The version number of this document (it will strictly increase after each
     * change, including undo/redo).
     */
    val version: Int

    /**
     * `true` if there are unpersisted changes.
     */
    val isDirty: Boolean

    /**
     * `true` if the document has been closed. A closed document isn't synchronized anymore
     * and won't be re-used when the same resource is opened again.
     */
    val isClosed: Boolean

    /**
     * Save the underlying file.
     *
     * @returns A promise that will resolve to `true` when the file
     * has been saved. If the save failed, will return `false`.
     */
//  save(): Thenable<boolean>

    /**
     * The {@link EndOfLine end of line} sequence that is predominately
     * used in this document.
     */
    val eol: EndOfLine

    /**
     * The number of lines in this document.
     */
    val lineCount: Int

    /**
     * Returns a text line denoted by the line number. Note
     * that the returned object is *not* live and changes to the
     * document are not reflected.
     *
     * @param line A line number in `[0, lineCount)`.
     * @returns A {@link TextLine line}.
     */
//  lineAt(line: number): TextLine

    /**
     * Returns a text line denoted by the position. Note
     * that the returned object is *not* live and changes to the
     * document are not reflected.
     *
     * The position will be {@link TextDocument.validatePosition adjusted}.
     *
     * @see {@link TextDocument.lineAt}
     *
     * @param position A position.
     * @returns A {@link TextLine line}.
     */
//  lineAt(position: Position): TextLine

    /**
     * Converts the position to a zero-based offset.
     *
     * The position will be {@link TextDocument.validatePosition adjusted}.
     *
     * @param position A position.
     * @returns A valid zero-based offset in UTF-16 [code units](https://developer.mozilla.org/en-US/docs/Glossary/Code_unit).
     */
//  offsetAt(position: Position): number

    /**
     * Converts a zero-based offset to a position.
     *
     * @param offset A zero-based offset into the document. This offset is in UTF-16 [code units](https://developer.mozilla.org/en-US/docs/Glossary/Code_unit).
     * @returns A valid {@link Position}.
     */
//  positionAt(offset: number): Position

    /**
     * Get the text of this document. A substring can be retrieved by providing
     * a range. The range will be {@link TextDocument.validateRange adjusted}.
     *
     * @param range Include only the text included by the range.
     * @returns The text inside the provided range or the entire text.
     */
//  getText(range?: Range): string

    /**
     * Get a word-range at the given position. By default words are defined by
     * common separators, like space, -, _, etc. In addition, per language custom
     * [word definitions] can be defined. It
     * is also possible to provide a custom regular expression.
     *
     * * *Note 1:* A custom regular expression must not match the empty string and
     * if it does, it will be ignored.
     * * *Note 2:* A custom regular expression will fail to match multiline strings
     * and in the name of speed regular expressions should not match words with
     * spaces. Use {@linkcode TextLine.text} for more complex, non-wordy, scenarios.
     *
     * The position will be {@link TextDocument.validatePosition adjusted}.
     *
     * @param position A position.
     * @param regex Optional regular expression that describes what a word is.
     * @returns A range spanning a word, or `undefined`.
     */
//  getWordRangeAtPosition(position: Position, regex?: RegExp): Range | undefined

    /**
     * Ensure a range is completely contained in this document.
     *
     * @param range A range.
     * @returns The given range or a new, adjusted range.
     */
//  validateRange(range: Range): Range

    /**
     * Ensure a position is contained in the range of this document.
     *
     * @param position A position.
     * @returns The given position or a new, adjusted position.
     */
//  validatePosition(position: Position): Position
}
