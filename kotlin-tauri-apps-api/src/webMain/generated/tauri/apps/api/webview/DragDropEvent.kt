// Automatically generated - do not modify!

package tauri.apps.api.webview

/**
 * The payload of a drag and drop event, see {@link Webview.onDragDropEvent}.
 *
 * - `enter`: the user dragged files over the webview; `paths` holds the dragged files.
 * - `over`: the cursor moved while dragging; only `position` changes.
 * - `drop`: the files were dropped; `paths` holds the dropped files.
 * - `leave`: the drag left the webview or was cancelled.
 *
 * Positions are in physical pixels, relative to the webview's top-left corner.
 */
typealias DragDropEvent = Any /* {
    type: 'enter';
    paths: string[];
    position: PhysicalPosition;
} | {
    type: 'over';
    position: PhysicalPosition;
} | {
    type: 'drop';
    paths: string[];
    position: PhysicalPosition;
} | {
    type: 'leave';
} */
