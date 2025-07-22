// Automatically generated - do not modify!

package vscode

/**
 * An event that is fired after files are renamed.
 */
external interface FileRenameEvent {
    /**
    // ORIGINAL SOURCE


    /**
     * The files that got renamed.
    */
    readonly files: ReadonlyArray<{
    /**
     * The old uri of a file.
    */
    readonly oldUri: Uri;
    /**
     * The new uri of a file.
    */
    readonly newUri: Uri;
    }>;

    // ORIGINAL SOURCE
     **/
}
