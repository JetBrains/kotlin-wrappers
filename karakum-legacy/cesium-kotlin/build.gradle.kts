plugins {
    alias(kfc.plugins.library)
    `cesium-declarations`
}

dependencies {
    commonMainImplementation(npmv("@cesium/engine"))
    commonMainImplementation(npmv("@cesium/widgets"))
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
