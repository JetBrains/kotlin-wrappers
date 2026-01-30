package js.objects

import kotlin.test.Test
import kotlin.test.assertEquals

class ExtensionsTest {

    @Test
    fun pairSequenceToRecord() {
        val expected = recordOf(
            "one" to 1,
            "two" to 2,
        )
        val actual = sequenceOf(
            "one" to 1,
            "two" to 2,
        ).toMutableRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

    @Test
    fun jsTupleSequenceToRecord() {
        val expected = recordOf(
            "one" to 1,
            "two" to 2,
        )
        val actual = Object.entries(expected).asSequence()
            .toMutableRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

    @Test
    fun tupleIterableToRecord() {
        val expected = recordOf(
            "one" to 1,
            "two" to 2,
        )
        val actual = Object.entries(expected)
            .map { (first, second) -> first to second }
            .toMutableRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

    @Test
    fun mapToRecord() {
        val expected = recordOf(
            "one" to 1,
            "two" to 2,
        )
        val actual = mapOf(
            "one" to 1,
            "two" to 2,
        ).toMutableRecord()

        assertEquals(JSON.stringify(expected), JSON.stringify(actual))
    }

}
