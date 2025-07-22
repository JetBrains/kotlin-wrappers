// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents programming constructs like variables, classes, interfaces etc. that appear in a document. Document
 * symbols can be hierarchical and they have two ranges: one that encloses its definition and one that points to
 * its most interesting range, e.g. the range of an identifier.
 */
open external class DocumentSymbol {
    /**
    // ORIGINAL SOURCE


    /**
     * The name of this symbol.
    */
    name: string;

    /**
     * More detail for this symbol, e.g. the signature of a function.
    */
    detail: string;

    /**
     * The kind of this symbol.
    */
    kind: SymbolKind;

    /**
     * Tags for this symbol.
    */
    tags?: readonly SymbolTag[];

    /**
     * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
    */
    range: Range;

    /**
     * The range that should be selected and reveal when this symbol is being picked, e.g. the name of a function.
     * Must be contained by the {@linkcode DocumentSymbol.range range}.
    */
    selectionRange: Range;

    /**
     * Children of this symbol, e.g. properties of a class.
    */
    children: DocumentSymbol[];

    /**
     * Creates a new document symbol.
     *
     * @param name The name of the symbol.
     * @param detail Details for the symbol.
     * @param kind The kind of the symbol.
     * @param range The full range of the symbol.
     * @param selectionRange The range that should be reveal.
    */
    constructor(name: string, detail: string, kind: SymbolKind, range: Range, selectionRange: Range);

    // ORIGINAL SOURCE
     **/
}
