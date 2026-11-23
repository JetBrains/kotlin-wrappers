import org.gradle.api.internal.artifacts.dependencies.DefaultExternalModuleDependency

plugins {
    id("generatorbuild.karakum-conventions")
}

karakum {
    library(
        jspkg.typescript.map {
            DefaultExternalModuleDependency(
                it.group,
                "@karakum-input/typescript",
                "npm:${it.name}@${it.version}",
            )
        },
    )
}
