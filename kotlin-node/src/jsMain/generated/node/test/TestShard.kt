// Generated by Karakum - do not modify it manually!

package node.test

sealed external interface TestShard {
    /**
     * A positive integer between 1 and `total` that specifies the index of the shard to run.
     */
    var index: Double

    /**
     * A positive integer that specifies the total number of shards to split the test files to.
     */
    var total: Double
}
