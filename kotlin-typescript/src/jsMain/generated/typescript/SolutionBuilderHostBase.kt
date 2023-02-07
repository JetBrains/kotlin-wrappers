// Automatically generated - do not modify!

package typescript

sealed external interface SolutionBuilderHostBase<T : BuilderProgram> : ProgramHost<T> {
    val createDirectory: ((path: String) -> Unit)?

    /**
     * Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
     * writeFileCallback
     */
    val writeFile: ((
        path: String,
        data: String,
        writeByteOrderMark: Boolean?,
    ) -> Unit)?
    var getCustomTransformers: ((project: String) -> CustomTransformers?)?
    fun getModifiedTime(fileName: String): kotlin.js.Date?
    fun setModifiedTime(
        fileName: String,
        date: kotlin.js.Date,
    )

    fun deleteFile(fileName: String)
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
    var reportDiagnostic: DiagnosticReporter
    var reportSolutionBuilderStatus: DiagnosticReporter
    val afterProgramEmitAndDiagnostics: ((program: T) -> Unit)?
}
