// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents programming constructs like variables, classes, interfaces etc. that appear in a document. Document
 * symbols can be hierarchical and they have two ranges: one that encloses its definition and one that points to
 * its most interesting range, e.g. the range of an identifier.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol)
 */
open external class DocumentSymbol {
    /**
     * The name of this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.name)
     */
    var name: String

    /**
     * More detail for this symbol, e.g. the signature of a function.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.detail)
     */
    var detail: String

    /**
     * The kind of this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.kind)
     */
    var kind: SymbolKind

    /**
     * Tags for this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.tags)
     */
    var tags: ReadonlyArray<SymbolTag>?

    /**
     * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.range)
     */
    var range: Range

    /**
     * The range that should be selected and reveal when this symbol is being picked, e.g. the name of a function.
     * Must be contained by the {@linkcode DocumentSymbol.range range}.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.selectionRange)
     */
    var selectionRange: Range

    /**
     * Children of this symbol, e.g. properties of a class.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.children)
     */
    var children: ReadonlyArray<DocumentSymbol>

    /**
     * Creates a new document symbol.
     *
     * @param name The name of the symbol.
     * @param detail Details for the symbol.
     * @param kind The kind of the symbol.
     * @param range The full range of the symbol.
     * @param selectionRange The range that should be reveal.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#DocumentSymbol.constructor)
     */
    constructor(
        name: String,
        detail: String,
        kind: SymbolKind,
        range: Range,
        selectionRange: Range,
    )
}
