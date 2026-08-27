plugins {
    id("karakum.cesium-declarations")
}

kotlin {
    sourceSets.webMain.dependencies {
        npm(jspkg.cesium.engine)
        npm(jspkg.cesium.widgets)
    }
}

tasks.register<SyncWrappers>("syncCesiumEngine") {
    from(webGeneratedDir) {
        include("cesium/engine/")
    }
    into(webMainDir("kotlin-cesium-engine"))
}

tasks.register<SyncWrappers>("syncCesiumWidgets") {
    from(webGeneratedDir) {
        include("cesium/widgets/")
    }
    into(webMainDir("kotlin-cesium-widgets"))
}
