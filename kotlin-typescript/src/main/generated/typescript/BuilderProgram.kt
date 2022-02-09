// Automatically generated - do not modify!

package typescript

import kotlinx.js.ReadonlyArray

/**
 * Builder to manage the program state changes
 */
sealed external interface BuilderProgram {
    /**
     * Returns current program
     */
    fun getProgram(): Program

    /**
     * Get compiler options of the program
     */
    fun getCompilerOptions(): CompilerOptions

    /**
     * Get the source file in the program with file name
     */
    fun getSourceFile(fileName: String): SourceFile?

    /**
     * Get a list of files in the program
     */
    fun getSourceFiles(): ReadonlyArray<SourceFile>

    /**
     * Get the diagnostics for compiler options
     */
    fun getOptionsDiagnostics(cancellationToken: CancellationToken = definedExternally): ReadonlyArray<Diagnostic>

    /**
     * Get the diagnostics that dont belong to any file
     */
    fun getGlobalDiagnostics(cancellationToken: CancellationToken = definedExternally): ReadonlyArray<Diagnostic>

    /**
     * Get the diagnostics from config file parsing
     */
    fun getConfigFileParsingDiagnostics(): ReadonlyArray<Diagnostic>

    /**
     * Get the syntax diagnostics, for all source files if source file is not supplied
     */
    fun getSyntacticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<Diagnostic>

    /**
     * Get the declaration diagnostics, for all source files if source file is not supplied
     */
    fun getDeclarationDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<DiagnosticWithLocation>

    /**
     * Get all the dependencies of the file
     */
    fun getAllDependencies(sourceFile: SourceFile): ReadonlyArray<String>

    /**
     * Gets the semantic diagnostics from the program corresponding to this state of file (if provided) or whole program
     * The semantic diagnostics are cached and managed here
     * Note that it is assumed that when asked about semantic diagnostics through this API,
     * the file has been taken out of affected files so it is safe to use cache or get from program and cache the diagnostics
     * In case of SemanticDiagnosticsBuilderProgram if the source file is not provided,
     * it will iterate through all the affected files, to ensure that cache stays valid and yet provide a way to get all semantic diagnostics
     */
    fun getSemanticDiagnostics(
        sourceFile: SourceFile = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
    ): ReadonlyArray<Diagnostic>

    /**
     * Emits the JavaScript and declaration files.
     * When targetSource file is specified, emits the files corresponding to that source file,
     * otherwise for the whole program.
     * In case of EmitAndSemanticDiagnosticsBuilderProgram, when targetSourceFile is specified,
     * it is assumed that that file is handled from affected file list. If targetSourceFile is not specified,
     * it will only emit all the affected files instead of whole program
     *
     * The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
     * in that order would be used to write the files
     */
    fun emit(
        targetSourceFile: SourceFile = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
        emitOnlyDtsFiles: Boolean = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): EmitResult

    /**
     * Get the current directory of the program
     */
    fun getCurrentDirectory(): String
}
