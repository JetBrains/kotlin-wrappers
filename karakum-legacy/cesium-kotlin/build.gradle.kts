plugins {
    alias(kfc.plugins.library)
    alias(libs.plugins.seskar)
    `cesium-declarations`
}

dependencies {
    commonMainImplementation(npmv("@cesium/engine"))
    commonMainImplementation(npmv("@cesium/widgets"))

    commonMainImplementation(kotlinWrappers.browser)
}

val syncCesiumEngine by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("cesium/engine/")
    }
    into(kotlinWrappersCommonDir("kotlin-cesium-engine"))
}

val syncCesiumWidgets by tasks.registering(SyncWrappers::class) {
    from(commonGeneratedDir) {
        include("cesium/widgets/")
    }
    into(kotlinWrappersCommonDir("kotlin-cesium-widgets"))
}

val generate by tasks.registering {
    dependsOn(syncCesiumEngine)
    dependsOn(syncCesiumWidgets)
}
