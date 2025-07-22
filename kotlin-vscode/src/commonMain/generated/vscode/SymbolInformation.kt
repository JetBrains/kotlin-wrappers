// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray

/**
 * Represents information about programming constructs like variables, classes,
 * interfaces etc.
 */
open external class SymbolInformation {
    /**
     * The name of this symbol.
     */
    var name: String

    /**
     * The name of the symbol containing this symbol.
     */
    var containerName: String

    /**
     * The kind of this symbol.
     */
    var kind: SymbolKind

    /**
     * Tags for this symbol.
     */
    var tags: ReadonlyArray<SymbolTag>?

    /**
     * The location of this symbol.
     */
    var location: Location

    /**
     * Creates a new symbol information object.
     *
     * @param name The name of the symbol.
     * @param kind The kind of the symbol.
     * @param containerName The name of the symbol containing the symbol.
     * @param location The location of the symbol.
     */
    constructor(
        name: String,
        kind: SymbolKind,
        containerName: String,
        location: Location,
    )

    /**
     * Creates a new symbol information object.
     *
     * @deprecated Please use the constructor taking a {@link Location} object.
     *
     * @param name The name of the symbol.
     * @param kind The kind of the symbol.
     * @param range The range of the location of the symbol.
     * @param uri The resource of the location of symbol, defaults to the current document.
     * @param containerName The name of the symbol containing the symbol.
     */
    constructor(
        name: String,
        kind: SymbolKind,
        range: Range,
        uri: Uri = definedExternally,
        containerName: String = definedExternally,
    )
}
