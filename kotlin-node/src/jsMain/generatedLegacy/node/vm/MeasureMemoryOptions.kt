// Automatically generated - do not modify!

package node.vm

sealed external interface MeasureMemoryOptions {
    /**
     * @default 'summary'
     */
    var mode: MeasureMemoryMode?

    /**
     * @default 'default'
     */
    var execution: Any? /* 'default' | 'eager' */
}
