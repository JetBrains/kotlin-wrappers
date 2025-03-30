// Automatically generated - do not modify!

package typescript

sealed external interface SourceMapSource {
    var fileName: String
    var text: String
    var skipTrivia: ((pos: Double) -> Double)?
    fun getLineAndCharacterOfPosition(pos: Double): LineAndCharacter
}
