// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

import typescript.sync.DiagnosticReporter

external fun <T : BuilderProgram /* default is EmitAndSemanticDiagnosticsBuilderProgram */> createSolutionBuilderWithWatchHost(
    system: System = definedExternally,
    createProgram: CreateProgram<T> = definedExternally,
    reportDiagnostic: DiagnosticReporter = definedExternally,
    reportSolutionBuilderStatus: DiagnosticReporter = definedExternally,
    reportWatchStatus: WatchStatusReporter = definedExternally,
): SolutionBuilderWithWatchHost<T>
