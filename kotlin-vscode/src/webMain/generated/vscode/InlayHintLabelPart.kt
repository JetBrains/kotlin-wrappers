// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * An inlay hint label part allows for interactive and composite labels of inlay hints.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintLabelPart)
 */
open external class InlayHintLabelPart {
    /**
     * The value of this label part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintLabelPart.value)
     */
    var value: String

    /**
     * The tooltip text when you hover over this label part.
     *
     * *Note* that this property can be set late during
     * [resolving][InlayHintsProvider.resolveInlayHint] of inlay hints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintLabelPart.tooltip)
     */
    var tooltip: JsAny /* string | MarkdownString */?

    /**
     * An optional [source code location][Location] that represents this label
     * part.
     *
     * The editor will use this location for the hover and for code navigation features: This
     * part will become a clickable link that resolves to the definition of the symbol at the
     * given location (not necessarily the location itself), it shows the hover that shows at
     * the given location, and it shows a context menu with further code navigation commands.
     *
     * *Note* that this property can be set late during
     * [resolving][InlayHintsProvider.resolveInlayHint] of inlay hints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintLabelPart.location)
     */
    var location: Location?

    /**
     * An optional command for this label part.
     *
     * The editor renders parts with commands as clickable links. The command is added to the context menu
     * when a label part defines [location} and {@link InlayHintLabelPart.command command][InlayHintLabelPart.location] .
     *
     * *Note* that this property can be set late during
     * [resolving][InlayHintsProvider.resolveInlayHint] of inlay hints.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintLabelPart.command)
     */
    var command: Command?

    /**
     * Creates a new inlay hint label part.
     *
     * @param value The value of the part.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#InlayHintLabelPart.constructor)
     */
    constructor(value: String)
}
