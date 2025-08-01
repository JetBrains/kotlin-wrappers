// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Denotes a location of an editor in the window. Editors can be arranged in a grid
 * and each column represents one editor location in that grid by counting the editors
 * in order of their appearance.
 */
sealed /* enum */
external interface ViewColumn {
    companion object {
        /**
         * A *symbolic* editor column representing the currently active column. This value
         * can be used when opening editors, but the *resolved* {@link TextEditor.viewColumn viewColumn}-value
         * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Active`.
         */
        val Active: ViewColumn // -1

        /**
         * A *symbolic* editor column representing the column to the side of the active one. This value
         * can be used when opening editors, but the *resolved* {@link TextEditor.viewColumn viewColumn}-value
         * of editors will always be `One`, `Two`, `Three`,... or `undefined` but never `Beside`.
         */
        val Beside: ViewColumn // -2

        /**
         * The first editor column.
         */
        val One: ViewColumn // 1

        /**
         * The second editor column.
         */
        val Two: ViewColumn // 2

        /**
         * The third editor column.
         */
        val Three: ViewColumn // 3

        /**
         * The fourth editor column.
         */
        val Four: ViewColumn // 4

        /**
         * The fifth editor column.
         */
        val Five: ViewColumn // 5

        /**
         * The sixth editor column.
         */
        val Six: ViewColumn // 6

        /**
         * The seventh editor column.
         */
        val Seven: ViewColumn // 7

        /**
         * The eighth editor column.
         */
        val Eight: ViewColumn // 8

        /**
         * The ninth editor column.
         */
        val Nine: ViewColumn // 9
    }
}
