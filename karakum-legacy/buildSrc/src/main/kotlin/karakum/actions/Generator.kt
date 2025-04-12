package karakum.actions

import karakum.common.GENERATOR_COMMENT
import karakum.common.Suppress
import karakum.common.Suppress.ABSTRACT_MEMBER_NOT_IMPLEMENTED
import karakum.common.fileSuppress
import karakum.common.writeCode
import java.io.File

private val DEFAULT_IMPORTS = """
import js.promise.Promise
import js.collections.ReadonlyMap
import js.core.BigInt
import js.core.UInt53
import js.date.Date
import js.objects.JsPlainObject
import js.objects.ReadonlyRecord
import js.objects.Record
import js.array.JsTuple2
import js.array.ReadonlyArray
import js.core.Void
import js.errors.JsError
import js.generator.AsyncGenerator
import node.buffer.Buffer
import node.http.IncomingHttpHeaders
import node.http.OutgoingHttpHeaders
import web.url.URL

import actions.http.client.HttpClient
import actions.http.client.HttpClientResponse

import seskar.js.JsAsync
import seskar.js.JsRawValue
import seskar.js.JsValue
""".trimIndent()

fun generateKotlinDeclarations(
    definitionsDir: File,
    sourceDir: File,
) {
    definitionsDir.listFiles()!!
        .filter { it.isDirectory }
        .forEach { dir ->
            generate(
                definitionsDir = dir,
                sourceDir = sourceDir,
            )
        }
}

private fun generate(
    definitionsDir: File,
    sourceDir: File,
) {
    val result = convertLibrary(definitionsDir)
    val library = result.library

    val dir = sourceDir.resolve(library.path)
        .also { it.mkdirs() }

    for ((name, body) in result.results) {
        val suppresses = mutableListOf<Suppress>().apply {
            if (name in CREDENTIAL_HANDLERS)
                add(ABSTRACT_MEMBER_NOT_IMPLEMENTED)
        }.toTypedArray()

        var annotations = when {
            "external class " in body
                    || "external val " in body
                    || "external fun " in body
                -> {
                val module = sequenceOf(
                    library.moduleId,
                    result.getPath(name),
                ).filterNotNull()
                    .joinToString("/")

                """@file:JsModule("$module")"""
            }

            else -> ""
        }

        if (suppresses.isNotEmpty()) {
            annotations = sequenceOf(
                annotations,
                fileSuppress(*suppresses)
            ).filter { it.isNotEmpty() }
                .joinToString("\n\n")
        }

        val finalBody = fileContent(
            annotations = annotations,
            body = body,
            pkg = library.pkg,
        )

        val fileName = if ("external val " in body) {
            "$name.val.kt"
        } else {
            "$name.kt"
        }

        val f = dir.resolve(fileName)
        check(!f.exists()) {
            "File $f already exists!"
        }

        f.writeCode(finalBody)
    }
}

private fun fileContent(
    annotations: String = "",
    body: String,
    pkg: String,
): String {
    val result = sequenceOf(
        "// $GENERATOR_COMMENT",
        annotations,
        "package $pkg",
        DEFAULT_IMPORTS,
        body,
    ).filter { it.isNotEmpty() }
        .joinToString("\n\n")

    return result
}
