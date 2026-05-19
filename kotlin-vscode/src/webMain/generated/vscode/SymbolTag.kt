// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Symbol tags are extra annotations that tweak the rendering of a symbol.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#SymbolTag)
 */
sealed /* enum */
external interface SymbolTag {
    companion object {
        /**
         * Render a symbol as obsolete, usually using a strike-out.
         */
        val Deprecated: SymbolTag // 1
    }
}
