// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

external fun <T : BuilderProgram /* default is EmitAndSemanticDiagnosticsBuilderProgram */> createSolutionBuilderHost(
    system: System = definedExternally,
    createProgram: CreateProgram<T> = definedExternally,
    reportDiagnostic: DiagnosticReporter = definedExternally,
    reportSolutionBuilderStatus: DiagnosticReporter = definedExternally,
    reportErrorSummary: ReportEmitErrorSummary = definedExternally,
): SolutionBuilderHost<T>
