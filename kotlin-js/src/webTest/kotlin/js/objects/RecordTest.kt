package js.objects

import js.array.component1
import js.array.component2
import js.array.tupleOf
import kotlin.js.get
import kotlin.js.length
import kotlin.js.toJsNumber
import kotlin.js.toJsString
import kotlin.test.Test
import kotlin.test.assertEquals

class RecordTest {

    @Test
    fun pairSequenceToRecord() {
        val actual = sequenceOf(
            "one".toJsString() to 1.toJsNumber(),
            "two".toJsString() to 2.toJsNumber(),
        ).toRecord()

        assertEquals(2, Object.keys(actual).length)
        assertEquals(actual["one"], 1.toJsNumber())
        assertEquals(actual["two"], 2.toJsNumber())
    }

    @Test
    fun jsTupleSequenceToRecord() {
        val expected = Record {
            set("one".toJsString(), 1.toJsNumber())
            set("two".toJsString(), 2.toJsNumber())
        }

        val entries = Object.entries(expected)
        var count = entries.length
        val actual = generateSequence {
            if ((count--) > 0) {
                val entry = entries[count]
                checkNotNull(entry)
                val (key, value) = entry
                tupleOf(key, value)
            } else {
                null
            }
        }.toRecord()

        assertEquals(2, Object.keys(actual).length)
        assertEquals(actual["one"], 1.toJsNumber())
        assertEquals(actual["two"], 2.toJsNumber())
    }

    @Test
    fun tupleIterableToRecord() {
        val actual = listOf(
            Pair("one".toJsString(), 1.toJsNumber()),
            Pair("two".toJsString(), 2.toJsNumber()),
        ).toRecord()

        assertEquals(2, Object.keys(actual).length)
        assertEquals(actual["one"], 1.toJsNumber())
        assertEquals(actual["two"], 2.toJsNumber())
    }

    @Test
    fun mapToRecord() {
        val actual = mapOf(
            "one".toJsString() to 1.toJsNumber(),
            "two".toJsString() to 2.toJsNumber(),
        ).toRecord()

        assertEquals(2, Object.keys(actual).length)
        assertEquals(actual["one"], 1.toJsNumber())
        assertEquals(actual["two"], 2.toJsNumber())
    }

}
