// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Completion item tags are extra annotations that tweak the rendering of a completion
 * item.
 */
sealed /* enum */
external interface CompletionItemTag {
    companion object {
        /**
         * Render a completion as obsolete, usually using a strike-out.
         */
        val Deprecated: CompletionItemTag // 1
    }
}
