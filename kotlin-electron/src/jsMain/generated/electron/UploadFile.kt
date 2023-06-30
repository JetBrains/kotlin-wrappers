package electron


external interface UploadFile {
// Docs: https://electronjs.org/docs/api/structures/upload-file
    /**
     * Path of file to be uploaded.
     */
    var filePath: String

    /**
     * Number of bytes to read from `offset`. Defaults to `0`.
     */
    var length: Double

    /**
     * Last Modification time in number of seconds since the UNIX epoch.
     */
    var modificationTime: Double

    /**
     * Defaults to `0`.
     */
    var offset: Double

    /**
     * `file`.
     */
    var type: String /* 'file' */
}
