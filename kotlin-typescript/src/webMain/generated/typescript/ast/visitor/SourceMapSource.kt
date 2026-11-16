// Automatically generated - do not modify!

package typescript.ast.visitor

import typescript.ast.LineAndCharacter

external interface SourceMapSource {
    var fileName: String
    var text: String
    var skipTrivia: ((pos: Int) -> Int)?

    fun getLineAndCharacterOfPosition(pos: Int): LineAndCharacter
}
