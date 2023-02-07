// Automatically generated - do not modify!

package typescript

sealed external interface BuilderProgramHost {
    /**
     * return true if file names are treated with case sensitivity
     */
    fun useCaseSensitiveFileNames(): Boolean

    /**
     * If provided this would be used this hash instead of actual file shape text for detecting changes
     */
    var createHash: ((data: String) -> String)?

    /**
     * When emit or emitNextAffectedFile are called without writeFile,
     * this callback if present would be used to write files
     */
    var writeFile: WriteFileCallback?
}
