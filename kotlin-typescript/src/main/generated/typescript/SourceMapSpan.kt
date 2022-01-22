// Automatically generated - do not modify!

package typescript

external interface SourceMapSpan {
    /** Line number in the .js file. */
    var emittedLine: Int

    /** Column number in the .js file. */
    var emittedColumn: Int

    /** Line number in the .ts file. */
    var sourceLine: Int

    /** Column number in the .ts file. */
    var sourceColumn: Int

    /** Optional name (index into names array) associated with this span. */
    var nameIndex: Int?

    /** .ts file (index into sources array) associated with this span */
    var sourceIndex: Int
}
