// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Completion item tags are extra annotations that tweak the rendering of a completion
 * item.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#CompletionItemTag)
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
