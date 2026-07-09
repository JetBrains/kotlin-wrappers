package pako

import js.array.JsArray
import js.array.toList
import js.buffer.ArrayBuffer
import js.objects.unsafeJso
import js.reflect.unsafeCast
import js.typedarrays.Uint8Array
import js.typedarrays.toUByteArray
import js.typedarrays.toUint8Array
import kotlin.js.JsAny
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

// for accessing intermediate chunks of inflator/deflator
private external interface StreamChunks {
    val chunks: JsArray<Uint8Array<ArrayBuffer>>
}

private fun chunksOf(stream: JsAny): List<Uint8Array<ArrayBuffer>> =
    unsafeCast<StreamChunks>(stream).chunks.toList()

private fun join(parts: List<Uint8Array<ArrayBuffer>>): Uint8Array<ArrayBuffer> =
    parts.flatMap { it.toUByteArray().toList() }.toUByteArray().toUint8Array()

class DeflateInflateTests {

    private val sample: ByteArray =
        ByteArray(4096) { (it % 64).toByte() }

    @Test
    fun streamingDeflate() {
        // Mirrors the JS usage:
        //   const deflate = new pako.Deflate()
        //   deflate.push(chunk, pako.constants.Z_NO_FLUSH)
        //   deflate.push(lastChunk, pako.constants.Z_FINISH)
        val chunk1 = "Hello, pako! ".repeat(50)
        val chunk2 = "Goodbye, pako! ".repeat(50)
        val original = chunk1 + chunk2

        val deflater = Deflate()

        assertTrue(deflater.push(chunk1, Flush.Z_NO_FLUSH), "push(chunk1) should succeed")
        assertTrue(deflater.push(chunk2, Flush.Z_FINISH), "push(lastChunk) should succeed")

        // `if (deflate.err)` in JS — success means Z_OK
        assertEquals(ReturnCode.Z_OK, deflater.err, "deflate.msg = ${deflater.msg}")

        val streamed = assertNotNull(deflater.result, "result should be filled after Z_FINISH")
        assertTrue(streamed.length > 0, "compressed output should be non-empty")

        // Streamed output must decompress back to the original text.
        val restored = inflate(streamed, unsafeJso<InflateToStringOptions> { to = To.string })
        assertEquals(original, restored)
    }

    @Test
    fun deflateUint8ArrayRoundTrip() {
        val input = sample.toUint8Array()

        val compressed = deflate(input)
        assertTrue(compressed.length < input.length, "repeated data should compress")

        val restored = inflate(compressed)
        assertContentEquals(sample.toUByteArray(), restored.toUByteArray())
    }

    @Test
    fun deflateArrayBufferRoundTrip() {
        val compressed = deflate(sample.toUint8Array().buffer)
        val restored = inflate(compressed.buffer)

        assertContentEquals(sample.toUByteArray(), restored.toUByteArray())
    }

    @Test
    fun deflateStringRoundTrip() {
        val text = "Round-trip string sample. ".repeat(40)

        val compressed = deflate(text)
        val restored = inflate(compressed, unsafeJso<InflateToStringOptions> { to = To.string })

        assertEquals(text, restored)
    }

    @Test
    fun gzipRoundTrip() {
        val compressed = gzip(sample.toUint8Array())

        // inflate() autodetects the gzip wrapper via its header.
        assertContentEquals(sample.toUByteArray(), inflate(compressed).toUByteArray())
        // ungzip() is the explicit shortcut for the same thing.
        assertContentEquals(sample.toUByteArray(), ungzip(compressed).toUByteArray())
    }

    @Test
    fun rawRoundTrip() {
        // Raw streams carry no zlib/gzip header, so they must be paired with inflateRaw.
        val compressed = deflateRaw(sample.toUint8Array())
        val restored = inflateRaw(compressed)

        assertContentEquals(sample.toUByteArray(), restored.toUByteArray())
    }

    @Test
    fun compressionLevelOption() {
        val stored = deflate(sample.toUint8Array(), unsafeJso<DeflateOptions> { level = 0 })
        val best = deflate(sample.toUint8Array(), unsafeJso<DeflateOptions> { level = 9 })

        // level 0 = "stored" (no compression), so it must be larger than level 9.
        assertTrue(stored.length > best.length, "level 0 (${stored.length}) should exceed level 9 (${best.length})")

        // Both levels must still round-trip to the same bytes.
        assertContentEquals(sample.toUByteArray(), inflate(stored).toUByteArray())
        assertContentEquals(sample.toUByteArray(), inflate(best).toUByteArray())
    }

    @Test
    fun strategyOption() {
        val compressed = deflate(sample.toUint8Array(), unsafeJso<DeflateOptions> { strategy = Strategy.Z_RLE })
        assertContentEquals(sample.toUByteArray(), inflate(compressed).toUByteArray())
    }

    @Test
    fun streamingInflate() {
        val compressed = deflate(sample.toUint8Array()).toUByteArray()
        val half = compressed.size / 2

        val inflater = Inflate()
        assertTrue(inflater.push(compressed.copyOfRange(0, half).toUint8Array(), Flush.Z_NO_FLUSH))
        assertTrue(inflater.push(compressed.copyOfRange(half, compressed.size).toUint8Array(), Flush.Z_FINISH))

        assertEquals(ReturnCode.Z_OK, inflater.err, "inflate.msg = ${inflater.msg}")
        val restored = assertNotNull(inflater.result)
        assertContentEquals(sample.toUByteArray(), restored.toUByteArray())
    }

    @Test
    fun invalidInputReportsError() {
        // 0xFF bytes are not a valid zlib stream.
        val garbage = ByteArray(32) { 0xFF.toByte() }.toUint8Array()

        val inflater = Inflate()
        assertTrue(!inflater.push(garbage, Flush.Z_FINISH), "push() should return false on bad input")
        assertNotEquals(ReturnCode.Z_OK, inflater.err, "err should be a failure code")
        assertEquals(ReturnCode.Z_DATA_ERROR, inflater.err, "err should be a Z_DATA_ERROR (${ReturnCode.Z_DATA_ERROR}) code, got ${inflater.err}")
    }

    // assesses access to the intermediate results of inflate/deflate, when
    // Z_SYNC_FLUSH is on
    @Test
    fun syncFlushStreamsChunksIncrementally() {
        // Requires pako >= 2.2.0: Inflate emits output on each flush (#259).
        // Distinct per-chunk content so mis-ordering or double-emit would be caught.
        val chunks = (0 until 20).map { "chunk-$it ".repeat(5).encodeToByteArray() }

        val deflater = Deflate(unsafeJso<DeflateOptions> { raw = true })
        val inflater = Inflate(unsafeJso<InflateOptions> { raw = true })

        var deflatedLength = 0
        var inflatedLength = 0

        for (chunk in chunks) {
            // Each Z_SYNC_FLUSH push must flush this chunk's compressed bytes…
            assertTrue(deflater.push(chunk.toUint8Array(), Flush.Z_SYNC_FLUSH))
            val newCompressed = chunksOf(deflater).drop(deflatedLength)
            deflatedLength += newCompressed.size
            val segment = join(newCompressed)
            assertTrue(segment.length > 0, "Z_SYNC_FLUSH should emit output for every push")

            // …and the receiver must recover exactly that chunk, in order, immediately.
            assertTrue(inflater.push(segment, Flush.Z_SYNC_FLUSH))
            val newDecoded = chunksOf(inflater).drop(inflatedLength)
            inflatedLength += newDecoded.size
            assertContentEquals(
                chunk.toUByteArray(),
                join(newDecoded).toUByteArray(),
                "each sync-flushed chunk should decode to itself, once",
            )
        }

        assertEquals(ReturnCode.Z_OK, inflater.err, "inflate error: ${inflater.err}")
        val original = chunks.reduce(ByteArray::plus)
        assertContentEquals(original.toUByteArray(), join(chunksOf(inflater)).toUByteArray())
    }
}
