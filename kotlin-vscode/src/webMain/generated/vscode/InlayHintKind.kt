// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Inlay hint kinds.
 *
 * The kind of an inline hint defines its appearance, e.g the corresponding foreground and background colors are being
 * used.
 */
sealed /* enum */
external interface InlayHintKind {
    companion object {
        /**
         * An inlay hint that is for a type annotation.
         */
        val Type: InlayHintKind // 1

        /**
         * An inlay hint that is for a parameter.
         */
        val Parameter: InlayHintKind // 2
    }
}
