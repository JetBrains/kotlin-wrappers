// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents programming constructs like functions or constructors in the context
 * of call hierarchy.
 */
open external class CallHierarchyItem {
    /**
    // ORIGINAL SOURCE

    /**
     * The name of this item.
    */
    name: string;

    /**
     * The kind of this item.
    */
    kind: SymbolKind;

    /**
     * Tags for this item.
    */
    tags?: readonly SymbolTag[];

    /**
     * More detail for this item, e.g. the signature of a function.
    */
    detail?: string;

    /**
     * The resource identifier of this item.
    */
    uri: Uri;

    /**
     * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
    */
    range: Range;

    /**
     * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
     * Must be contained by the {@linkcode CallHierarchyItem.range range}.
    */
    selectionRange: Range;

    /**
     * Creates a new call hierarchy item.
    */
    constructor(kind: SymbolKind, name: string, detail: string, uri: Uri, range: Range, selectionRange: Range);

    // ORIGINAL SOURCE
     **/
}
