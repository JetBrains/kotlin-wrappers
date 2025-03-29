package wrappers.example

import web.blob.Blob
import web.prompts.alert

suspend fun main() {
    val blob = Blob()

    alert("Hello, world!")
    alert("Blob size: ${blob.size}")
}
