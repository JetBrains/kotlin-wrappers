// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents an item of a type hierarchy, like a class or an interface.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem)
 */
open external class TypeHierarchyItem {
    /**
     * The name of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.name)
     */
    var name: String

    /**
     * The kind of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.kind)
     */
    var kind: SymbolKind

    /**
     * Tags for this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.tags)
     */
    var tags: ReadonlyArray<SymbolTag>?

    /**
     * More detail for this item, e.g. the signature of a function.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.detail)
     */
    var detail: String?

    /**
     * The resource identifier of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.uri)
     */
    var uri: Uri

    /**
     * The range enclosing this symbol not including leading/trailing whitespace
     * but everything else, e.g. comments and code.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.range)
     */
    var range: Range

    /**
     * The range that should be selected and revealed when this symbol is being
     * picked, e.g. the name of a class. Must be contained by the [range][TypeHierarchyItem.range]-property.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.selectionRange)
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
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TypeHierarchyItem.constructor)
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
