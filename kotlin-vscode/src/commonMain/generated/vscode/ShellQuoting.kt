// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

import kotlin.js.JsModule

/**
 * Defines how an argument should be quoted if it contains
 * spaces or unsupported characters.
 */
sealed /* enum */
external interface ShellQuoting {
    companion object {
        /**
         * Character escaping should be used. This for example
         * uses \ on bash and ` on PowerShell.
         */
        val Escape: ShellQuoting // 1

        /**
         * Strong string quoting should be used. This for example
         * uses " for Windows cmd and ' for bash and PowerShell.
         * Strong quoting treats arguments as literal strings.
         * Under PowerShell echo 'The value is $(2 * 3)' will
         * print `The value is $(2 * 3)`
         */
        val Strong: ShellQuoting // 2

        /**
         * Weak string quoting should be used. This for example
         * uses " for Windows cmd, bash and PowerShell. Weak quoting
         * still performs some kind of evaluation inside the quoted
         * string.  Under PowerShell echo "The value is $(2 * 3)"
         * will print `The value is 6`
         */
        val Weak: ShellQuoting // 3
    }
}
