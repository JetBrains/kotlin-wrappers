plugins {
    id("karakum.cesium-declarations")
}

dependencies {
    commonMainImplementation(npm(jspkg.cesium.engine))
    commonMainImplementation(npm(jspkg.cesium.widgets))
}

val syncCesiumEngine by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include("cesium/engine/")
    }
    into(kotlinWrappersCommonDir("kotlin-cesium-engine"))
}

val syncCesiumWidgets by tasks.registering(SyncWrappers::class) {
    from(webGeneratedDir) {
        include("cesium/widgets/")
    }
    into(kotlinWrappersCommonDir("kotlin-cesium-widgets"))
}
