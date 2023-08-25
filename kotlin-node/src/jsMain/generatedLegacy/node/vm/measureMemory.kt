// Automatically generated - do not modify!

package node.vm

import js.promise.await

suspend fun measureMemory(): MemoryMeasurement =
    measureMemoryAsync().await()

suspend fun measureMemory(
    options: MeasureMemoryOptions,
): MemoryMeasurement =
    measureMemoryAsync(
        options = options,
    ).await()
