plugins {
    `karakum-conventions`
}

dependencies {
    jsMainImplementation(libs.karakum)

    jsMainImplementation(libs.arrow.core)

    jsMainImplementation(libs.node.map {
        devNpm(it.name, requireNotNull(it.version))
    })
}
