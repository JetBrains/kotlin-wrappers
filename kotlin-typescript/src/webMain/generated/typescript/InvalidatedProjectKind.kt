// Automatically generated - do not modify!

@file:JsModule("typescript")

package typescript

/* enum */
@SubclassOptInRequired(js.internal.InternalApi::class)
external interface InvalidatedProjectKind {
    sealed interface Build : InvalidatedProjectKind

    sealed interface UpdateOutputFileStamps : InvalidatedProjectKind

    companion object {
        val Build: Build
        val UpdateOutputFileStamps: UpdateOutputFileStamps
    }
}
