// Automatically generated - do not modify!

package vscode

/**
 * A file associated with a {@linkcode DataTransferItem}.
 *
 * Instances of this type can only be created by the editor and not by extensions.
 */
external interface DataTransferFile {
    /**
    // ORIGINAL SOURCE

    /**
     * The name of the file.
    */
    readonly name: string;

    /**
     * The full file path of the file.
     *
     * May be `undefined` on web.
    */
    readonly uri?: Uri;

    /**
     * The full file contents of the file.
    */
    data(): Thenable<Uint8Array>;

    // ORIGINAL SOURCE
     **/
}
