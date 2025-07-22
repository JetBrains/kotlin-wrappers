// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package vscode

/**
 * A file system watcher notifies about changes to files and folders
 * on disk or from other {@link FileSystemProvider FileSystemProviders}.
 *
 * To get an instance of a `FileSystemWatcher` use
 * {@link workspace.createFileSystemWatcher createFileSystemWatcher}.
 */
external interface FileSystemWatcher :
    Disposable {
    /**
     * true if this file system watcher has been created such that
     * it ignores creation file system events.
     */
//  readonly ignoreCreateEvents: boolean;

    /**
     * true if this file system watcher has been created such that
     * it ignores change file system events.
     */
//  readonly ignoreChangeEvents: boolean;

    /**
     * true if this file system watcher has been created such that
     * it ignores delete file system events.
     */
//  readonly ignoreDeleteEvents: boolean;

    /**
     * An event which fires on file/folder creation.
     */
//  readonly onDidCreate: Event<Uri>;

    /**
     * An event which fires on file/folder change.
     */
//  readonly onDidChange: Event<Uri>;

    /**
     * An event which fires on file/folder deletion.
     */
//  readonly onDidDelete: Event<Uri>;
}
