// Automatically generated - do not modify!

package node.vm

import kotlinx.coroutines.await

suspend fun measureMemory(
    options: MeasureMemoryOptions,
): MemoryMeasurement =
    measureMemoryAsync(
        options = options,
    ).await()
