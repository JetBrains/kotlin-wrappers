// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/**
 * Create the watch compiler host for either configFile or fileNames and its options
 */
external fun <T : BuilderProgram> createWatchCompilerHost(
    configFileName: String,
    optionsToExtend: CompilerOptions?,
    system: System,
    createProgram: CreateProgram<T> = definedExternally,
    reportDiagnostic: DiagnosticReporter = definedExternally,
    reportWatchStatus: WatchStatusReporter = definedExternally,
    watchOptionsToExtend: WatchOptions = definedExternally,
    extraFileExtensions: js.array.ReadonlyArray<FileExtensionInfo> = definedExternally,
): WatchCompilerHostOfConfigFile<T>

external fun <T : BuilderProgram> createWatchCompilerHost(
    rootFiles: js.array.ReadonlyArray<String>,
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram<T> = definedExternally,
    reportDiagnostic: DiagnosticReporter = definedExternally,
    reportWatchStatus: WatchStatusReporter = definedExternally,
    projectReferences: js.array.ReadonlyArray<ProjectReference> = definedExternally,
    watchOptions: WatchOptions = definedExternally,
): WatchCompilerHostOfFilesAndCompilerOptions<T>
