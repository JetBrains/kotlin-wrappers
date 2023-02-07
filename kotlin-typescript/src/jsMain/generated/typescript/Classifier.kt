// Automatically generated - do not modify!

package typescript

sealed external interface Classifier {

    fun getEncodedLexicalClassifications(
        text: String,
        endOfLineState: EndOfLineState,
        syntacticClassifierAbsent: Boolean,
    ): Classifications
}
