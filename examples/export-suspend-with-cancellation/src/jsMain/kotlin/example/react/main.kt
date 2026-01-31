package example.react

import js.globals.globalThis

fun main() {
    globalThis["myCounter"] = Counter()
}
