// Automatically generated - do not modify!

package typescript

/**
 * Subset of properties from SourceFile that are used in multiple utility functions
 */
sealed external interface SourceFileLike {
    val text: String
    fun getLineAndCharacterOfPosition(pos: Int): LineAndCharacter
}
