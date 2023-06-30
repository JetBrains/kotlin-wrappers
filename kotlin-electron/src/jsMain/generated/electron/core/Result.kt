package electron.core


external interface Result {
    var requestId: Double

    /**
     * Position of the active match.
     */
    var activeMatchOrdinal: Double

    /**
     * Number of Matches.
     */
    var matches: Double

    /**
     * Coordinates of first match region.
     */
    var selectionArea: Rectangle
    var finalUpdate: Boolean
}
