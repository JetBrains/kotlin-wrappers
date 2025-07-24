// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsModule

/**
 * Signature help represents the signature of something
 * callable. There can be multiple signatures but only one
 * active and only one active parameter.
 */
open external class SignatureHelp {
    /**
     * One or more signatures.
     */
    var signatures: ReadonlyArray<SignatureInformation>

    /**
     * The active signature.
     */
    var activeSignature: Int

    /**
     * The active parameter of the active signature.
     */
    var activeParameter: Int
}
