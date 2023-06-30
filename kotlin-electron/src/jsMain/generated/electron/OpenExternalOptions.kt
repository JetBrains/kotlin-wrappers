package electron


external interface OpenExternalOptions {
    /**
     * `true` to bring the opened application to the foreground. The default is `true`.
     *
     * @platform darwin
     */
    var activate: Boolean?

    /**
     * The working directory.
     *
     * @platform win32
     */
    var workingDirectory: String?

    /**
     * Indicates a user initiated launch that enables tracking of frequently used
     * programs and other behaviors. The default is `false`.
     *
     * @platform win32
     */
    var logUsage: Boolean?
}
