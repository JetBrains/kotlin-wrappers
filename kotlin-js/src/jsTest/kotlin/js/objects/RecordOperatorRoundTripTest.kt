package js.objects

import kotlin.js.JsAny
import kotlin.js.JsString
import kotlin.js.toJsString
import kotlin.test.Test
import kotlin.test.assertEquals

class RecordOperatorRoundTripTest {

    @Test
    fun setAndGetRoundTrip() {
        val record = unsafeJso<Record<JsString, JsAny?>>()
        val key = "proof-key".toJsString()
        val value = "proof-value".toJsString()

        record[key] = value

        assertEquals(value, record[key])
    }

    @Test
    fun readonlyRecordGet() {
        val record = unsafeJso<Record<JsString, JsAny?>>()
        val key = "readonly-key".toJsString()
        val value = "readonly-value".toJsString()

        record[key] = value

        val readOnly: ReadonlyRecord<JsString, JsAny?> = record
        assertEquals(value, readOnly[key])
    }

    @Test
    fun proofLevel5SetAndGet() {
        val obj = createProofRecord()
        val key = "chain-key".toJsString()
        val value = "chain-value".toJsString()

        obj[key] = value

        assertEquals(value, obj[key])
    }
}
