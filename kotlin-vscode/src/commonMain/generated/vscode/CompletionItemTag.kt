// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

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
