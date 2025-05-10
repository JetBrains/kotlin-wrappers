plugins {
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainImplementation(libs.node.map {
        devNpm(it.name, requireNotNull(it.version))
    })
}

karakum {
    output = layout.projectDirectory.dir("../src/commonMain/generated")
}
