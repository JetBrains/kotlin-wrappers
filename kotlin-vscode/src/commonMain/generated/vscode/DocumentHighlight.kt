// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * A document highlight is a range inside a text document which deserves
 * special attention. Usually a document highlight is visualized by changing
 * the background color of its range.
 */
open external class DocumentHighlight {
    /**
    // ORIGINAL SOURCE


    /**
     * The range this highlight applies to.
    */
    range: Range;

    /**
     * The highlight kind, default is {@link DocumentHighlightKind.Text text}.
    */
    kind?: DocumentHighlightKind;

    /**
     * Creates a new document highlight object.
     *
     * @param range The range the highlight applies to.
     * @param kind The highlight kind, default is {@link DocumentHighlightKind.Text text}.
    */
    constructor(range: Range, kind?: DocumentHighlightKind);

    // ORIGINAL SOURCE
     **/
}
