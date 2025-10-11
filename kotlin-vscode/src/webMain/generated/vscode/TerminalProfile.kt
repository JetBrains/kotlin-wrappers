// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import kotlin.js.JsAny
import kotlin.js.JsModule

/**
 * A terminal profile defines how a terminal will be launched.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalProfile)
 */
open external class TerminalProfile {
    /**
     * The options that the terminal will launch with.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalProfile.options)
     */
    var options: JsAny /* TerminalOptions | ExtensionTerminalOptions */

    /**
     * Creates a new terminal profile.
     * @param options The options that the terminal will launch with.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#TerminalProfile.constructor)
     */
    constructor(options: TerminalOptions)

    constructor(options: ExtensionTerminalOptions)
}
