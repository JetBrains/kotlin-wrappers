// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Represents the signature of something callable. A signature
 * can have a label, like a function-name, a doc-comment, and
 * a set of parameters.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureInformation)
 */
open external class SignatureInformation {
    /**
     * The label of this signature. Will be shown in
     * the UI.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureInformation.label)
     */
    var label: String

    /**
     * The human-readable doc-comment of this signature. Will be shown
     * in the UI but can be omitted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureInformation.documentation)
     */
    var documentation: JsAny /* string | MarkdownString */?

    /**
     * The parameters of this signature.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureInformation.parameters)
     */
    var parameters: ReadonlyArray<ParameterInformation>

    /**
     * The index of the active parameter.
     *
     * If provided, this is used in place of [SignatureHelp.activeParameter].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureInformation.activeParameter)
     */
    var activeParameter: Int?

    /**
     * Creates a new signature information object.
     *
     * @param label A label string.
     * @param documentation A doc string.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SignatureInformation.constructor)
     */
    constructor(
        label: String,
        documentation: String = definedExternally,
    )

    constructor(
        label: String,
        documentation: MarkdownString,
    )
}
