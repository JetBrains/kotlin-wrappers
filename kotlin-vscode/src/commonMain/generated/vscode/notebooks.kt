// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

/**
 * Namespace for notebooks.
 *
 * The notebooks functionality is composed of three loosely coupled components:
 *
 * 1. {@link NotebookSerializer} enable the editor to open, show, and save notebooks
 * 2. {@link NotebookController} own the execution of notebooks, e.g they create output from code cells.
 * 3. NotebookRenderer present notebook output in the editor. They run in a separate context.
 */
external object notebooks {
    /**
    // ORIGINAL SOURCE

    /**
     * Creates a new notebook controller.
     *
     * @param id Identifier of the controller. Must be unique per extension.
     * @param notebookType A notebook type for which this controller is for.
     * @param label The label of the controller.
     * @param handler The execute-handler of the controller.
     * @returns A new notebook controller.
    */
    export function createNotebookController(id: string, notebookType: string, label: string, handler?: (cells: NotebookCell[], notebook: NotebookDocument, controller: NotebookController) => void | Thenable<void>): NotebookController;

    /**
     * Register a {@link NotebookCellStatusBarItemProvider cell statusbar item provider} for the given notebook type.
     *
     * @param notebookType The notebook type to register for.
     * @param provider A cell status bar provider.
     * @returns A {@link Disposable} that unregisters this provider when being disposed.
    */
    export function registerNotebookCellStatusBarItemProvider(notebookType: string, provider: NotebookCellStatusBarItemProvider): Disposable;

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
    export function createRendererMessaging(rendererId: string): NotebookRendererMessaging;

    // ORIGINAL SOURCE
     **/
}
