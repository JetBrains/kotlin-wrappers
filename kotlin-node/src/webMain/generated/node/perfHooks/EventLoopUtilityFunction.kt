// Automatically generated - do not modify!

package node.perfHooks

/**
 * @param utilization1 The result of a previous call to `eventLoopUtilization()`.
 * @param utilization2 The result of a previous call to `eventLoopUtilization()` prior to `utilization1`.
 */
typealias EventLoopUtilityFunction = (
    utilization1: EventLoopUtilization?, /* use undefined for default */
    utilization2: EventLoopUtilization?, // use undefined for default
) -> EventLoopUtilization
