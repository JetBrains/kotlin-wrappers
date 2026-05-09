// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * The ExtensionMode is provided on the `ExtensionContext` and indicates the
 * mode the specific extension is running in.
 */
sealed /* enum */
external interface ExtensionMode {
    companion object {
        /**
         * The extension is installed normally (for example, from the marketplace
         * or VSIX) in the editor.
         */
        val Production: ExtensionMode // 1

        /**
         * The extension is running from an `--extensionDevelopmentPath` provided
         * when launching the editor.
         */
        val Development: ExtensionMode // 2

        /**
         * The extension is running from an `--extensionTestsPath` and
         * the extension host is running unit tests.
         */
        val Test: ExtensionMode // 3
    }
}
