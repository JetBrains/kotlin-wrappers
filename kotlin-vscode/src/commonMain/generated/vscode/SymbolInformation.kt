// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Represents information about programming constructs like variables, classes,
 * interfaces etc.
 */
open external class SymbolInformation {
    /**
     * The name of this symbol.
     */
//  name: string

    /**
     * The name of the symbol containing this symbol.
     */
//  containerName: string

    /**
     * The kind of this symbol.
     */
//  kind: SymbolKind

    /**
     * Tags for this symbol.
     */
//  tags?: readonly SymbolTag[]

    /**
     * The location of this symbol.
     */
//  location: Location

    /**
     * Creates a new symbol information object.
     *
     * @param name The name of the symbol.
     * @param kind The kind of the symbol.
     * @param containerName The name of the symbol containing the symbol.
     * @param location The location of the symbol.
     */
//  constructor(name: string, kind: SymbolKind, containerName: string, location: Location)

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
//  constructor(name: string, kind: SymbolKind, range: Range, uri?: Uri, containerName?: string)
}
