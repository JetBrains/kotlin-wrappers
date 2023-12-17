// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface InvalidatedProjectKind {
    companion object {
        @JsIntValue(0)
        val Build: Build

        @JsIntValue(1)
        val UpdateBundle: UpdateBundle

        @JsIntValue(2)
        val UpdateOutputFileStamps: UpdateOutputFileStamps
    }

    sealed interface Build : InvalidatedProjectKind
    sealed interface UpdateBundle : InvalidatedProjectKind
    sealed interface UpdateOutputFileStamps : InvalidatedProjectKind
}
