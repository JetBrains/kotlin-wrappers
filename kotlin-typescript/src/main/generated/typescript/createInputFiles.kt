// Automatically generated - do not modify!

@file:JsModule("typescript")
@file:JsNonModule

package typescript

external fun createInputFiles(
    javascriptText: String,
    declarationText: String,
): InputFiles

external fun createInputFiles(
    readFileText: (path: String) -> String?,
    javascriptPath: String,
    javascriptMapPath: String?,
    declarationPath: String,
    declarationMapPath: String?,
    buildInfoPath: String?,
): InputFiles

external fun createInputFiles(
    javascriptText: String,
    declarationText: String,
    javascriptMapPath: String?,
    javascriptMapText: String?,
    declarationMapPath: String?,
    declarationMapText: String?,
): InputFiles
