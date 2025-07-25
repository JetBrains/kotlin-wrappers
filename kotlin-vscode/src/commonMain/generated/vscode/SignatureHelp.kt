// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Signature help represents the signature of something
 * callable. There can be multiple signatures but only one
 * active and only one active parameter.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelp)
 */
open external class SignatureHelp {
    /**
     * One or more signatures.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelp.signatures)
     */
    var signatures: ReadonlyArray<SignatureInformation>

    /**
     * The active signature.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelp.activeSignature)
     */
    var activeSignature: Int

    /**
     * The active parameter of the active signature.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureHelp.activeParameter)
     */
    var activeParameter: Int
}
