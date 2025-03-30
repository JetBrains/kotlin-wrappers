// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript


sealed external interface InvalidatedProjectKind {
    sealed interface Build : InvalidatedProjectKind
    sealed interface UpdateOutputFileStamps : InvalidatedProjectKind

    companion object {
        val Build: Build
        val UpdateOutputFileStamps: UpdateOutputFileStamps
    }
}
