// Automatically generated - do not modify!

package typescript

/**
 * Subset of properties from SourceFile that are used in multiple utility functions
 */
sealed external interface SourceFileLike {
    val text: String
    var languageVariant: LanguageVariant?

    fun getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}
