// Automatically generated - do not modify!

package typescript

sealed external interface TextInsertion {
    var newText: String

    /** The position in newText the caret should point to after the insertion. */
    var caretOffset: Int
}
