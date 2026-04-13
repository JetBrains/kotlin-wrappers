// Automatically generated - do not modify!

package typescript

/**
 * The builder that can handle the changes in program and iterate through changed file to emit the files
 * The semantic diagnostics are cached per file and managed by clearing for the changed/affected files
 */
external interface EmitAndSemanticDiagnosticsBuilderProgram : SemanticDiagnosticsBuilderProgram {
    /**
     * Emits the next affected file's emit result (EmitResult and sourceFiles emitted) or returns undefined if iteration is complete
     * The first of writeFile if provided, writeFile of BuilderProgramHost if provided, writeFile of compiler host
     * in that order would be used to write the files
     */
    fun emitNextAffectedFile(
        writeFile: WriteFileCallback = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
        emitOnlyDtsFiles: Boolean = definedExternally,
        customTransformers: CustomTransformers = definedExternally,
    ): AffectedFileResult<EmitResult>
}
