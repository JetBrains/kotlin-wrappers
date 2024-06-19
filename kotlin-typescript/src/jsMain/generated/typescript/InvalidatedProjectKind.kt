// Automatically generated - do not modify!

package typescript

import seskar.js.JsIntValue

sealed external interface InvalidatedProjectKind {
    companion object {
        @JsIntValue(0)
        val Build: Build

        @JsIntValue(2)
        val UpdateOutputFileStamps: UpdateOutputFileStamps
    }

    sealed interface Build : InvalidatedProjectKind
    sealed interface UpdateOutputFileStamps : InvalidatedProjectKind
}
