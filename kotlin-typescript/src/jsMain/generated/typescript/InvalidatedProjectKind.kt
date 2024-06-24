// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript


sealed external interface InvalidatedProjectKind {
    sealed interface Build : InvalidatedProjectKind
    sealed interface UpdateBundle : InvalidatedProjectKind
    sealed interface UpdateOutputFileStamps : InvalidatedProjectKind

    companion object {
        val Build: Build

        /** @deprecated */
        val UpdateBundle: UpdateBundle
        val UpdateOutputFileStamps: UpdateOutputFileStamps
    }
}
