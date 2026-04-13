package wrappersgenerator.typescript.annotations

import io.github.sgrishchenko.karakum.extension.annotations.configurable.JsPlainObjectAnnotation
import io.github.sgrishchenko.karakum.extension.match
import io.github.sgrishchenko.karakum.extension.withName
import typescript.isInterfaceDeclaration

fun createJsPlainObjectAnnotation() =
    JsPlainObjectAnnotation(ignore = match {
        match(
            ::isInterfaceDeclaration,
            withName("ReadonlyTextRange")
        )
        match(
            ::isInterfaceDeclaration,
            withName("Node")
        )
        match(
            ::isInterfaceDeclaration,
            withName("Identifier")
        )
        match(
            ::isInterfaceDeclaration,
            withName("PrivateIdentifier")
        )
        match(
            ::isInterfaceDeclaration,
            withName("TypeReference")
        )
        match(
            ::isInterfaceDeclaration,
            withName("Signature")
        )
        match(
            ::isInterfaceDeclaration,
            withName("SourceFileLike")
        )
        match(
            ::isInterfaceDeclaration,
            withName("SourceMapSource")
        )
        match(
            ::isInterfaceDeclaration,
            withName("Type")
        )
        match(
            ::isInterfaceDeclaration,
            withName("FlowType")
        )
        match(
            ::isInterfaceDeclaration,
            withName("IncompleteType")
        )
        match(
            ::isInterfaceDeclaration,
            withName("Symbol")
        )
        match(
            ::isInterfaceDeclaration,
            withName("ConfigFileDiagnosticsReporter")
        )
        match(
            ::isInterfaceDeclaration,
            withName("BuilderProgramHost")
        )

        //TODO: BuildOptions
        //TODO: CompilerOptions
        //TODO: WatchOptions
    })
