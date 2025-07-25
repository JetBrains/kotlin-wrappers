// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Represents information about programming constructs like variables, classes,
 * interfaces etc.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation)
 */
open external class SymbolInformation {
    /**
     * The name of this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation.name)
     */
    var name: String

    /**
     * The name of the symbol containing this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation.containerName)
     */
    var containerName: String

    /**
     * The kind of this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation.kind)
     */
    var kind: SymbolKind

    /**
     * Tags for this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation.tags)
     */
    var tags: ReadonlyArray<SymbolTag>?

    /**
     * The location of this symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation.location)
     */
    var location: Location

    /**
     * Creates a new symbol information object.
     *
     * @param name The name of the symbol.
     * @param kind The kind of the symbol.
     * @param containerName The name of the symbol containing the symbol.
     * @param location The location of the symbol.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolInformation.constructor)
     */
    constructor(
        name: String,
        kind: SymbolKind,
        containerName: String,
        location: Location,
    )
}
