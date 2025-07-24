// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Namespace for notebooks.
 *
 * The notebooks functionality is composed of three loosely coupled components:
 *
 * 1. [NotebookSerializer] enable the editor to open, show, and save notebooks
 * 2. [NotebookController] own the execution of notebooks, e.g they create output from code cells.
 * 3. NotebookRenderer present notebook output in the editor. They run in a separate context.
 */
external object notebooks {
    /**
     * Creates a new notebook controller.
     *
     * @param id Identifier of the controller. Must be unique per extension.
     * @param notebookType A notebook type for which this controller is for.
     * @param label The label of the controller.
     * @param handler The execute-handler of the controller.
     * @returns A new notebook controller.
     */
    fun createNotebookController(
        id: String,
        notebookType: String,
        label: String,
        handler: (
            cells: ReadonlyArray<NotebookCell>,
            notebook: NotebookDocument,
            controller: NotebookController,
        ) -> PromiseLike<Void> = definedExternally,
    ): NotebookController

    /**
     * Register a {@link NotebookCellStatusBarItemProvider cell statusbar item provider} for the given notebook type.
     *
     * @param notebookType The notebook type to register for.
     * @param provider A cell status bar provider.
     * @returns A [Disposable] that unregisters this provider when being disposed.
     */
    fun registerNotebookCellStatusBarItemProvider(
        notebookType: String,
        provider: NotebookCellStatusBarItemProvider,
    ): Disposable

    /**
     * Creates a new messaging instance used to communicate with a specific renderer.
     *
     * * *Note 1:* Extensions can only create renderer that they have defined in their `package.json`-file
     * * *Note 2:* A renderer only has access to messaging if `requiresMessaging` is set to `always` or `optional` in
     * its `notebookRenderer` contribution.
     *
     * @param rendererId The renderer ID to communicate with
     * @returns A new notebook renderer messaging object.
     */
    fun createRendererMessaging(rendererId: String): NotebookRendererMessaging
}
