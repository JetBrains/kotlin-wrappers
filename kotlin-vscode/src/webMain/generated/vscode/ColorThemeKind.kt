// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Represents a color theme kind.
 */
sealed /* enum */
external interface ColorThemeKind {
    companion object {
        /**
         * A light color theme.
         */
        val Light: ColorThemeKind // 1

        /**
         * A dark color theme.
         */
        val Dark: ColorThemeKind // 2

        /**
         * A dark high contrast color theme.
         */
        val HighContrast: ColorThemeKind // 3

        /**
         * A light high contrast color theme.
         */
        val HighContrastLight: ColorThemeKind // 4
    }
}
