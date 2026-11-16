// Automatically generated - do not modify!

package typescript

import typescript.sync.Classifications
import typescript.sync.EndOfLineState

external interface Classifier {
    fun getEncodedLexicalClassifications(
        text: String,
        endOfLineState: EndOfLineState,
        syntacticClassifierAbsent: Boolean,
    ): Classifications
}
