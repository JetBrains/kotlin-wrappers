// Automatically generated - do not modify!

package typescript

external interface SolutionBuilder<T : BuilderProgram> {
    fun build(
        project: String = definedExternally,
        cancellationToken: CancellationToken = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        getCustomTransformers: (project: String) -> CustomTransformers = definedExternally,
    ): ExitStatus

    fun clean(project: String = definedExternally): ExitStatus
    fun buildReferences(
        project: String,
        cancellationToken: CancellationToken = definedExternally,
        writeFile: WriteFileCallback = definedExternally,
        getCustomTransformers: (project: String) -> CustomTransformers = definedExternally,
    ): ExitStatus

    fun cleanReferences(project: String = definedExternally): ExitStatus
    fun getNextInvalidatedProject(cancellationToken: CancellationToken = definedExternally): InvalidatedProject<T>?
}
