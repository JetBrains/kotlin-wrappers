// Automatically generated - do not modify!

package typescript

import js.date.Date

sealed external interface SolutionBuilderHostBase<T : BuilderProgram> : ProgramHost<T> {
    val createDirectory: ((path: String) -> Unit)?

    /**
     * Should provide create directory and writeFile if done of invalidatedProjects is not invoked with
     * writeFileCallback
     */
    val writeFile: ((path: String, data: String, writeByteOrderMark: Boolean? /* use undefined for default */) -> Unit)?
    var getCustomTransformers: ((project: String) -> CustomTransformers?)?
    fun getModifiedTime(fileName: String): Date?
    fun setModifiedTime(fileName: String, date: Date): Unit
    fun deleteFile(fileName: String): Unit
    val getParsedCommandLine: ((fileName: String) -> ParsedCommandLine?)?
    var reportDiagnostic: DiagnosticReporter
    var reportSolutionBuilderStatus: DiagnosticReporter
    val afterProgramEmitAndDiagnostics: ((program: T) -> Unit)?
}
