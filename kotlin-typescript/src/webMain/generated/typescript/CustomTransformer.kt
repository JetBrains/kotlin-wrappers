// Automatically generated - do not modify!

package typescript

import typescript.ast.Bundle
import typescript.ast.SourceFile

external interface CustomTransformer {
    fun transformSourceFile(node: SourceFile): SourceFile

    fun transformBundle(node: Bundle): Bundle
}
