// Automatically generated - do not modify!

package typescript

import js.core.ReadonlyArray

/**
 * The builder that caches the semantic diagnostics for the program and handles the changed files and affected files
 */
sealed external interface SemanticDiagnosticsBuilderProgram : BuilderProgram {
    /**
     * Gets the semantic diagnostics from the program for the next affected file and caches it
     * Returns undefined if the iteration is complete
     */
    fun getSemanticDiagnosticsOfNextAffectedFile(
        cancellationToken: CancellationToken = definedExternally,
        ignoreSourceFile: (sourceFile: SourceFile) -> Boolean = definedExternally,
    ): AffectedFileResult<ReadonlyArray<Diagnostic>>
}
