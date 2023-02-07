// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import js.core.ReadonlyArray

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
    extraFileExtensions: ReadonlyArray<FileExtensionInfo> = definedExternally,
): WatchCompilerHostOfConfigFile<T>

external fun <T : BuilderProgram> createWatchCompilerHost(
    rootFiles: ReadonlyArray<String>,
    options: CompilerOptions,
    system: System,
    createProgram: CreateProgram<T> = definedExternally,
    reportDiagnostic: DiagnosticReporter = definedExternally,
    reportWatchStatus: WatchStatusReporter = definedExternally,
    projectReferences: ReadonlyArray<ProjectReference> = definedExternally,
    watchOptions: WatchOptions = definedExternally,
): WatchCompilerHostOfFilesAndCompilerOptions<T>
