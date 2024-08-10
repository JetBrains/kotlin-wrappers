package js.function

import js.array.JsTuple
import js.array.JsTuple1
import js.array.JsTuple2
import js.array.JsTuple5
import js.objects.jso
import kotlin.test.Test
import kotlin.test.assertEquals

private external interface Merger_0 {
    var a: Int
    var b: Int

    @JsName("merge")
    var mergeNative: JsContextFunction<Merger_0, JsTuple, String>

    fun merge(): String
}

private external interface Merger_1 {
    var a: Int
    var b: Int

    @JsName("merge")
    var mergeNative: JsContextFunction<Merger_1, JsTuple1<String>, String>

    fun merge(p1: String): String
}

private external interface Merger_2 {
    var a: Int
    var b: Int

    @JsName("merge")
    var mergeNative: JsContextFunction<Merger_2, JsTuple2<String, String>, String>

    fun merge(p1: String, p2: String): String
}

private external interface Merger_5 {
    var a: Int
    var b: Int

    @JsName("merge")
    var mergeNative: JsContextFunction<Merger_5, JsTuple5<String, String, String, String, String>, String>

    fun merge(p1: String, p2: String, p3: String, p4: String, p5: String): String
}

class JsContextFunctionTest {
    @Test
    fun adapter_0() {
        val merger: Merger_0 = jso {
            a = 13
            b = 42
        }

        merger.mergeNative = JsContextFunction<Merger_0, String> {
            "a = $a, b = $b"
        }

        assertEquals(
            "a = 13, b = 42",
            merger.merge(),
        )
    }

    @Test
    fun adapter_1() {
        val merger: Merger_1 = jso {
            a = 13
            b = 42
        }

        merger.mergeNative = JsContextFunction { p1 ->
            "a = $a, b = $b, p1 = $p1"
        }

        assertEquals(
            "a = 13, b = 42, p1 = v1",
            merger.merge(p1 = "v1"),
        )
    }

    @Test
    fun adapter_2() {
        val merger: Merger_2 = jso {
            a = 13
            b = 42
        }

        merger.mergeNative = JsContextFunction { p1, p2 ->
            "a = $a, b = $b, p1 = $p1, p2 = $p2"
        }

        assertEquals(
            "a = 13, b = 42, p1 = v1, p2 = v2",
            merger.merge(p1 = "v1", p2 = "v2"),
        )
    }

    @Test
    fun adapter_5() {
        val merger: Merger_5 = jso {
            a = 13
            b = 42
        }

        merger.mergeNative = JsContextFunction { p1, p2, p3, p4, p5 ->
            "a = $a, b = $b, p1 = $p1, p2 = $p2, p3 = $p3, p4 = $p4, p5 = $p5"
        }

        assertEquals(
            "a = 13, b = 42, p1 = v1, p2 = v2, p3 = v3, p4 = v4, p5 = v5",
            merger.merge(p1 = "v1", p2 = "v2", p3 = "v3", p4 = "v4", p5 = "v5"),
        )
    }
}
