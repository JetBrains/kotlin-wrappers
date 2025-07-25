// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * A code lens represents a [Command] that should be shown along with
 * source text, like the number of references, a way to run tests, etc.
 *
 * A code lens is _unresolved_ when no command is associated to it. For performance
 * reasons the creation of a code lens and resolving should be done to two stages.
 *
 * @see [CodeLensProvider.provideCodeLenses]
 * @see [CodeLensProvider.resolveCodeLens]
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLens)
 */
open external class CodeLens {
    /**
     * The range in which this code lens is valid. Should only span a single line.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLens.range)
     */
    var range: Range

    /**
     * The command this code lens represents.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLens.command)
     */
    var command: Command?

    /**
     * `true` when there is a command associated.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLens.isResolved)
     */
    val isResolved: Boolean

    /**
     * Creates a new code lens object.
     *
     * @param range The range to which this code lens applies.
     * @param command The command associated to this code lens.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CodeLens.constructor)
     */
    constructor(
        range: Range,
        command: Command = definedExternally,
    )
}
