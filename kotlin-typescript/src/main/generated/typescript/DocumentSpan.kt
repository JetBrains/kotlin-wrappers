// Automatically generated - do not modify!

package typescript

external interface DocumentSpan {
    var textSpan: TextSpan
    var fileName: String

    /**
     * If the span represents a location that was remapped (e.g. via a .d.ts.map file),
     * then the original filename and span will be specified here
     */
    var originalTextSpan: TextSpan?
    var originalFileName: String?

    /**
     * If DocumentSpan.textSpan is the span for name of the declaration,
     * then this is the span for relevant declaration
     */
    var contextSpan: TextSpan?
    var originalContextSpan: TextSpan?
}
