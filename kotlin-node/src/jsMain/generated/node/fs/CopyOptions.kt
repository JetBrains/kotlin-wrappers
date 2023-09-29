package node.fs


sealed external interface CopyOptions : CopyOptionsBase {
    /**
     * Function to filter copied files/directories. Return
     * `true` to copy the item, `false` to ignore it.
     */
    fun filter(source: String, destination: String): Any /* boolean | Promise<boolean> */
}
