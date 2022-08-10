// Automatically generated - do not modify!

package node.os

sealed external interface CpuInfo {
    var model: String
    var speed: Number
    var times: dynamic /* {
        user: number;
        nice: number;
        sys: number;
        idle: number;
        irq: number;
    } */
}
