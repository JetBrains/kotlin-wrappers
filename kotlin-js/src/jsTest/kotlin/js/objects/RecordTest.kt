package js.objects

import js.array.component1
import js.array.component2
import kotlin.test.Test
import kotlin.test.assertEquals

class RecordTest {

    @Test
    fun pairSequenceToRecord() {
        val expected = Record {
            set("one", 1)
            set("two", 2)
        }
        val actual = sequenceOf(
            "one" to 1,
            "two" to 2,
        ).toRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

    @Test
    fun jsTupleSequenceToRecord() {
        val expected = Record {
            set("one", 1)
            set("two", 2)
        }
        val actual = Object.entries(expected).asSequence()
            .toRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

    @Test
    fun tupleIterableToRecord() {
        val expected = Record {
            set("one", 1)
            set("two", 2)
        }
        val actual = Object.entries(expected)
            .map { (first, second) -> first to second }
            .toRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

    @Test
    fun mapToRecord() {
        val expected = Record {
            set("one", 1)
            set("two", 2)
        }
        val actual = mapOf(
            "one" to 1,
            "two" to 2,
        ).toRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

}
