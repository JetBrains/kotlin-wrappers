package node.stream

import js.array.push
import kotlinx.coroutines.test.runTest
import node.buffer.Buffer
import kotlin.test.Test
import kotlin.test.assertContentEquals

class JsAsyncTest {
    @Test
    fun checkJsAsyncForPipeline() = runTest {
        val source = arrayOf(
            Buffer.from("hello"),
            Buffer.from("world"),
        )

        val actual = arrayOf<Buffer>()
        val destination = Writable(WritableOptions(
            write = { chunk, encoding, callback ->
                actual.push(chunk as Buffer)
                callback(null)
            }
        ))

        pipelineAsync(source, destination).await()
        // TODO: pipeline(source, destination)

        assertContentEquals(source, actual)
    }
}
