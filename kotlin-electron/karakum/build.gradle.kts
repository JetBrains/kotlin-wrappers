plugins {
    alias(libs.plugins.karakum)
}

dependencies {
    jsMainImplementation(libs.electron.map {
        devNpm(it.name, requireNotNull(it.version))
    })
}

karakum {
    output = layout.projectDirectory.dir("../src/commonMain/generated")
}
