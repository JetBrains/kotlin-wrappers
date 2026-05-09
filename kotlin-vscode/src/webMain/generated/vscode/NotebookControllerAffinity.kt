// Automatically generated - do not modify!

@file:JsModule("vscode")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package vscode

/**
 * Notebook controller affinity for notebook documents.
 *
 * @see {@link NotebookController.updateNotebookAffinity}
 */
sealed /* enum */
external interface NotebookControllerAffinity {
    companion object {
        /**
         * Default affinity.
         */
        val Default: NotebookControllerAffinity // 1

        /**
         * A controller is preferred for a notebook.
         */
        val Preferred: NotebookControllerAffinity // 2
    }
}
