package node.stream

import kotlinx.coroutines.test.runTest
import node.buffer.Buffer
import kotlin.test.Test
import kotlin.test.assertContentEquals

class JsAsyncTest {
    @Test
    fun checkJsAsyncForPipeline() = runTest {
        val source: Array<Buffer<*>> = arrayOf(
            Buffer.from("hello"),
            Buffer.from("world"),
        )

        val actual = mutableListOf<Buffer<*>>()
        val destination = Writable(
            opts = WritableOptions<Writable>(
                write = { chunk, encoding, callback ->
                    actual.add(chunk as Buffer<*>)
                    callback(null)
                }
            ),
        )

        pipelineAsync(source, destination).await()
        // TODO: pipeline(source, destination)

        assertContentEquals(source, actual.toTypedArray())
    }
}
