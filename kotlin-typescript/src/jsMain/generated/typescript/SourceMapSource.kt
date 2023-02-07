// Automatically generated - do not modify!

package typescript

sealed external interface SourceMapSource {
    var fileName: String
    var text: String
    var skipTrivia: ((pos: Int) -> Int)?
    fun getLineAndCharacterOfPosition(pos: Int): LineAndCharacter
}
