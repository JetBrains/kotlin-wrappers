// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents programming constructs like functions or constructors in the context
 * of call hierarchy.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem)
 */
open external class CallHierarchyItem {
    /**
     * The name of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.name)
     */
    var name: String

    /**
     * The kind of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.kind)
     */
    var kind: SymbolKind

    /**
     * Tags for this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.tags)
     */
    var tags: ReadonlyArray<SymbolTag>?

    /**
     * More detail for this item, e.g. the signature of a function.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.detail)
     */
    var detail: String?

    /**
     * The resource identifier of this item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.uri)
     */
    var uri: Uri

    /**
     * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.range)
     */
    var range: Range

    /**
     * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
     * Must be contained by the {@linkcode CallHierarchyItem.range range}.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.selectionRange)
     */
    var selectionRange: Range

    /**
     * Creates a new call hierarchy item.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CallHierarchyItem.constructor)
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
