// Automatically generated - do not modify!

package typescript

/**
 * Host to create watch with config file
 */
sealed external interface WatchCompilerHostOfConfigFile<T : BuilderProgram> : WatchCompilerHost<T>,
    ConfigFileDiagnosticsReporter {
    /** Name of the config file to compile */
    var configFileName: String

    /** Options to extend */
    var optionsToExtend: CompilerOptions?
    var watchOptionsToExtend: WatchOptions?
    var extraFileExtensions: (js.array.ReadonlyArray<FileExtensionInfo>)?

    /**
     * Used to generate source file names from the config file and its include, exclude, files rules
     * and also to cache the directory stucture
     */
    fun readDirectory(
        path: String,
        extensions: js.array.ReadonlyArray<String> = definedExternally,
        exclude: js.array.ReadonlyArray<String> = definedExternally,
        include: js.array.ReadonlyArray<String> = definedExternally,
        depth: Double = definedExternally,
    ): js.array.ReadonlyArray<String>
}
