// Automatically generated - do not modify!

package vscode

/**
 * A file system watcher notifies about changes to files and folders
 * on disk or from other [FileSystemProviders][FileSystemProvider].
 *
 * To get an instance of a `FileSystemWatcher` use
 * [createFileSystemWatcher][workspace.createFileSystemWatcher].
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher)
 */
external interface FileSystemWatcher :
    DisposableLike {
    /**
     * true if this file system watcher has been created such that
     * it ignores creation file system events.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher.ignoreCreateEvents)
     */
    val ignoreCreateEvents: Boolean

    /**
     * true if this file system watcher has been created such that
     * it ignores change file system events.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher.ignoreChangeEvents)
     */
    val ignoreChangeEvents: Boolean

    /**
     * true if this file system watcher has been created such that
     * it ignores delete file system events.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher.ignoreDeleteEvents)
     */
    val ignoreDeleteEvents: Boolean

    /**
     * An event which fires on file/folder creation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher.onDidCreate)
     */
    val onDidCreate: Event<Uri>

    /**
     * An event which fires on file/folder change.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher.onDidChange)
     */
    val onDidChange: Event<Uri>

    /**
     * An event which fires on file/folder deletion.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#FileSystemWatcher.onDidDelete)
     */
    val onDidDelete: Event<Uri>
}
