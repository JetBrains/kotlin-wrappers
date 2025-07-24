// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents an item of a type hierarchy, like a class or an interface.
 */
open external class TypeHierarchyItem {
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
     * The range enclosing this symbol not including leading/trailing whitespace
     * but everything else, e.g. comments and code.
     */
    var range: Range

    /**
     * The range that should be selected and revealed when this symbol is being
     * picked, e.g. the name of a class. Must be contained by the [range][TypeHierarchyItem.range]-property.
     */
    var selectionRange: Range

    /**
     * Creates a new type hierarchy item.
     *
     * @param kind The kind of the item.
     * @param name The name of the item.
     * @param detail The details of the item.
     * @param uri The Uri of the item.
     * @param range The whole range of the item.
     * @param selectionRange The selection range of the item.
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
