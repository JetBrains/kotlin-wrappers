// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * Represents programming constructs like functions or constructors in the context
 * of call hierarchy.
 */
open external class CallHierarchyItem {
    /**
     * The name of this item.
     */
    var name: String

    /**
     * The kind of this item.
     */
    var kind: SymbolKind

    /**
     * Tags for this item.
     */
    var tags: ReadonlyArray<SymbolTag>?

    /**
     * More detail for this item, e.g. the signature of a function.
     */
    var detail: String?

    /**
     * The resource identifier of this item.
     */
    var uri: Uri

    /**
     * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
     */
    var range: Range

    /**
     * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
     * Must be contained by the {@linkcode CallHierarchyItem.range range}.
     */
    var selectionRange: Range

    /**
     * Creates a new call hierarchy item.
     */
    constructor(
        kind: SymbolKind,
        name: String,
        detail: String,
        uri: Uri,
        range: Range,
        selectionRange: Range,
    )
}
