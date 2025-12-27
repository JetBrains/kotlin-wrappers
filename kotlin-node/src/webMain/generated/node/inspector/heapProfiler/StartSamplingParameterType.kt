// Automatically generated - do not modify!

package node.inspector.heapProfiler

sealed external interface StartSamplingParameterType {
    /**
     * Average sample interval in bytes. Poisson distribution is used for the intervals. The default value is 32768 bytes.
     */
    var samplingInterval: Double?
}
