package wrappersgenerator.node.annotations

import io.github.sgrishchenko.karakum.extension.annotations.configurable.JsPlainObjectAnnotation
import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.withFile
import io.github.sgrishchenko.karakum.extension.withName
import typescript.isInterfaceDeclaration

fun createJsPlainObjectAnnotation() =
    JsPlainObjectAnnotation(
        ignore = match {
            match(
                ::isInterfaceDeclaration,
                withFile("**/diagnostics_channel.d.ts"),
                withName("TracingChannelCollection")
            )

            match(
                ::isInterfaceDeclaration,
                withFile("**/http2.d.ts"),
                withName("IncomingHttpStatusHeader")
            )

            match(
                ::isInterfaceDeclaration,
                withFile("**/fs.d.ts"),
                withName("StatsFsBase")
            )

            match(
                ::isInterfaceDeclaration,
                withFile("**/fs.d.ts"),
                withName("StatsFs")
            )

            match(
                ::isInterfaceDeclaration,
                withFile("**/fs.d.ts"),
                withName("BigIntStatsFs")
            )

            match(
                ::isInterfaceDeclaration,
                withFile("**/process.d.ts"),
                withName("BuiltInModule")
            )

            match(
                ::isInterfaceDeclaration,
                withFile("**/test.d.ts"),
                withName("SuiteContext")
            )
        }
    )
