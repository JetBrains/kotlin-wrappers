package electron


external interface PageRanges {
    /**
     * Index of the first page to print (0-based).
     */
    var from: Double

    /**
     * Index of the last page to print (inclusive) (0-based).
     */
    var to: Double
}
