// Automatically generated - do not modify!

package typescript

sealed external interface SourceMapSpan {
    /** Line number in the .js file. */
    var emittedLine: Double

    /** Column number in the .js file. */
    var emittedColumn: Double

    /** Line number in the .ts file. */
    var sourceLine: Double

    /** Column number in the .ts file. */
    var sourceColumn: Double

    /** Optional name (index into names array) associated with this span. */
    var nameIndex: Double?

    /** .ts file (index into sources array) associated with this span */
    var sourceIndex: Double
}
